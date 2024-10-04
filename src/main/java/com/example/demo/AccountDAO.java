package com.example.demo;

import java.util.List;

public interface AccountDAO {
    List<Account> getClientAccounts(String ClientID);
    void createNewAccount(Account account);
    void updateAccount(Account account);
    List<Account> getCientAccountsByType(String clientID, AccountType accountType);
    AccountWithdraw getClientWithdrawAccount(String clientID,String accountID);

    Account getClientAccount(String clientID,String accountID);
}
