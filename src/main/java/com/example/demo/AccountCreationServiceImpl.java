package com.example.demo;

public class AccountCreationServiceImpl implements AccountCreationService {
    AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long BankID, String clientID, long accountID) {

        if (accountType != AccountType.Fixed) {
            accountDAO.createNewAccount(new Account(accountType, String.valueOf(BankID), clientID, 0, false));
        } else {
            accountDAO.createNewAccount(new Account(accountType, String.valueOf(BankID), clientID, 0, true));
        }
    }
}

