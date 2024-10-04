package com.example.demo;

public class Account {

    private AccountType accountType;
    private String id;//уникальный
    private String CLientID;//уникальный для клиента
    private double balance;
    private boolean withdrawAllowed;

    public Account(String id,String clientID,double balance,AccountType accountType,boolean withdrawAllowed)
    {
        this.id=id;
        this.CLientID=clientID;
        this.balance=balance;
        this.withdrawAllowed=withdrawAllowed;
        this.accountType=accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "clientid: "+this.CLientID+" Account Type: "+this.getAccountType()+" Balance: "+this.getBalance();
    }

    public String getClientID()
    { return CLientID;}

    public void setClientID(String id)
    {this.CLientID=id;}

    public Account(AccountType accountType,String id,String clientID,double balance,boolean withdrawAllowed)
    {
        this.accountType=accountType;
        this.id=id;
        this.CLientID=clientID;
        this.withdrawAllowed=withdrawAllowed;
    }

  public  boolean IsWithdrawAllowed()
    {
        return withdrawAllowed;
    }
    public void setWithdrawAllowed(boolean withdrawAllowed)
    {
        this.withdrawAllowed=withdrawAllowed;
    }

    public AccountType getAccountType()
    {
        return this.accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    public String getId()
    {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
