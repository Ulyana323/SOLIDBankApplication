package com.example.demo.repository;

import com.example.demo.entity.AccountType;

public interface AccountCreationService {
    void create(AccountType accountType, long BankID, String clientID, long accountID);
}
