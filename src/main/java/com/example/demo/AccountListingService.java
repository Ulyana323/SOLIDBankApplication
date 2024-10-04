package com.example.demo;

import java.util.List;

public interface AccountListingService {

    Account getClientAccount(String clientID,String AccountID);
    AccountWithdraw getClientWithdrawAccount(String clientID,String accountID);
    List<Account> getClientAccounts(String clientID);

    List <Account> getClientAccountsByType(String clientID,AccountType accountType);

}
