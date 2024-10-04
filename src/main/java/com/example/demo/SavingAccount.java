package com.example.demo;

public class SavingAccount extends AccountWithdraw{
    public SavingAccount(String id,String clientID,double balance)
    {
        super(AccountType.Saving,id,clientID,balance);
    }
}
