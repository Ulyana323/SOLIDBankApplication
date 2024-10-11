package com.example.demo.entity;


public class AccountDeposit  extends Account {
   public AccountDeposit(AccountType accountType, long id, String clientID, double balance)
   {
      super(accountType,id,clientID,balance,false);
   }
}
