package com.example.demo.entity;


public class CheckingAccount extends AccountWithdraw {


    public CheckingAccount(long id,String clientID,double balance)
    {
        super(AccountType.Checking,id,clientID,balance);
    }
}
