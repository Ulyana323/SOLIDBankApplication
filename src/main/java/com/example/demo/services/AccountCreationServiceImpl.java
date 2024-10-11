package com.example.demo.services;

import com.example.demo.repository.AccountCreationService;
import com.example.demo.repository.AccountDAO;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountCreationServiceImpl implements AccountCreationService {
    private final AccountDAO accountDAO;

    @Override
    public void create(AccountType accountType, long BankID, String clientID, long accountID) {

        if (accountType != AccountType.Fixed) {
            accountDAO.createNewAccount(new Account(accountType, accountID, clientID, 0, false));
        } else {
            accountDAO.createNewAccount(new Account(accountType,accountID, clientID, 0, true));
        }
    }
}

