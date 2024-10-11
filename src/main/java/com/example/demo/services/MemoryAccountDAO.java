package com.example.demo.services;

import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;
import com.example.demo.repository.AccountDAO;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Repository
public class MemoryAccountDAO implements AccountDAO {
   private List<Account> accountList;

    {
        accountList= new LinkedList<>();
    }
    public List<Account> getClientAccounts(String ClientID)
    {
       if(accountList.stream().anyMatch(x->x.getCLientID()==ClientID))
       {
           return accountList.stream().filter(x->x.getCLientID()==ClientID).toList();
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
      long Id=account.getId();
      if(accountList.stream().anyMatch(x->x.getId()==x.getId())){
      accountList.remove(accountList.stream().filter(x->x.getId()==Id).findFirst().get());
      accountList.add(account);}

    }
   public  List<Account> getCientAccountsByType(String clientID, AccountType accountType)
    {
        return accountList.stream().filter(x->x.getCLientID()==clientID && x.getAccountType()==accountType).toList();
    };
    public AccountWithdraw getClientWithdrawAccount(String clientID, long accountID)
    {///ошибка тута
      return accountList.stream()
                .filter(x -> x.getAccountType() == AccountType.Checking || x.getAccountType() == AccountType.Saving)
                .filter(x -> x.getCLientID().equals(clientID) && x.getId() == accountID)
                .map(ac->(AccountWithdraw) ac).findFirst().orElse(null);


    }


    public Account getClientAccount(String clientID,long accountID)
    {
        return accountList.stream().filter(a->a.getCLientID()==clientID && a.getId()==accountID).findFirst().get();
    };
}
