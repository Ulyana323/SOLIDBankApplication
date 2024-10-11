package com.example.demo.entity;


public class SavingAccount extends AccountWithdraw {
    public SavingAccount(long id,String clientID,double balance)
    {
        super(AccountType.Saving,id,clientID,balance);
    }
}
