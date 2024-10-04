package com.example.demo;

public class BankCore {
    static long id=1;
    long lastAccountNumber=1;
    AccountCreationService accountCreation;

    private double balance;

    public BankCore(AccountCreationService accountCreation)
    {
        this.accountCreation=accountCreation;
    }

    public void createNewAccount(AccountType accountType,String clientID)
    {
        incrementLastAccountNumber();
        accountCreation.create(accountType,id,clientID,lastAccountNumber);

    }

    private void incrementLastAccountNumber()
    {
        lastAccountNumber++;
    }

}
