package com.example.demo.repository;

import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccounts(String ClientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getCientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID, long accountID);

    Account getClientAccount(String clientID,long accountID);
}
