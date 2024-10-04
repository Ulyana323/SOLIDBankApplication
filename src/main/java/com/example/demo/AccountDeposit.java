package com.example.demo;

public class AccountDeposit  extends Account{
   public AccountDeposit(AccountType accountType,String id,String clientID,double balance)
   {
      super(accountType,id,clientID,balance,false);
   }
}
