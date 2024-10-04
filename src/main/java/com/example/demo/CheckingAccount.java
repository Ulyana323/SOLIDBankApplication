package com.example.demo;

public class CheckingAccount extends AccountWithdraw{


    public CheckingAccount(String id,String clientID,double balance)
    {
        super(AccountType.Checking,id,clientID,balance);
    }
}
