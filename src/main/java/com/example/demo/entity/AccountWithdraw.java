package com.example.demo.entity;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountWithdraw extends Account {

    public AccountWithdraw(AccountType accountType, long id, String clientID, double balance)
    {
        super(accountType,id,clientID,balance,true);
    }
}
