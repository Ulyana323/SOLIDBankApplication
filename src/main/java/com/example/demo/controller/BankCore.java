package com.example.demo.controller;

import com.example.demo.entity.AccountType;
import com.example.demo.repository.AccountCreationService;
import org.springframework.stereotype.Service;

@Service

public class BankCore {

    static long id=1;
    long lastAccountNumber=1;
    private final AccountCreationService accountCreation;

    private double balance;
    public BankCore(AccountCreationService accountCreation) {
        this.accountCreation = accountCreation; // Инъекция зависимости
    }

    public void createNewAccount(AccountType accountType, String clientID)
    {
        incrementLastAccountNumber();
        accountCreation.create(accountType,id,clientID,lastAccountNumber);

    }

    private void incrementLastAccountNumber()
    {
        lastAccountNumber++;
    }

}
