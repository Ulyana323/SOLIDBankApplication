package com.example.demo;

public class FixedAccount extends AccountDeposit {

    public FixedAccount(String id, String clientID, double balance) {
        super(AccountType.Fixed, id, clientID, balance);
    }
}
