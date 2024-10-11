package com.example.demo.entity;


public class FixedAccount extends AccountDeposit {

    public FixedAccount(long id, String clientID, double balance) {
        super(AccountType.Fixed, id, clientID, balance);
    }
}
