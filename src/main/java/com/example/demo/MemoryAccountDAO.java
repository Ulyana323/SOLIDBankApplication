package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class MemoryAccountDAO implements AccountDAO{
   private List<Account> accountList;

    {
        accountList= new LinkedList<>();
    }
    public List<Account> getClientAccounts(String ClientID)
    {
       if(accountList.stream().anyMatch(x->x.getClientID()==ClientID))
       {
           return accountList.stream().filter(x->x.getClientID()==ClientID).toList();
       }
       else
       {
           return null;
       }
    }
    public void createNewAccount(Account account)
    {
        if(accountList.contains(account))
        {
            return;
        }else
        {
            accountList.add(account);
        }
    }
    public void updateAccount(Account account)
    {
      String Id=account.getId();
      if(accountList.stream().anyMatch(x->x.getId()==x.getId())){
      accountList.remove(accountList.stream().filter(x->x.getId()==Id).findFirst().get());
      accountList.add(account);}

    }
   public  List<Account> getCientAccountsByType(String clientID, AccountType accountType)
    {
        return accountList.stream().filter(x->x.getClientID()==clientID && x.getAccountType()==accountType).toList();
    };
    public AccountWithdraw getClientWithdrawAccount(String clientID,String accountID)
    {
        return (AccountWithdraw) accountList.stream().filter(x->x.getAccountType()==AccountType.Checking ||
                x.getAccountType()==AccountType.Saving )
                .filter(x->x.getClientID()==clientID && x.getId()==accountID).findFirst().get();
    };

    public Account getClientAccount(String clientID,String accountID)
    {
        return accountList.stream().filter(a->a.getClientID()==clientID && a.getId()==accountID).findFirst().get();
    };
}
