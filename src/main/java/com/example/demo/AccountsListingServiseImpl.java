package com.example.demo;

import java.util.List;

public class AccountsListingServiseImpl implements AccountListingService{
    AccountDAO accountDAO;

    public AccountsListingServiseImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }
    @Override
    public Account getClientAccount(String clientID, String AccountID) {
       return accountDAO.getClientAccount(clientID,AccountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return accountDAO.getClientWithdrawAccount(clientID,accountID);
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return accountDAO.getCientAccountsByType(clientID,accountType);
    }
}

