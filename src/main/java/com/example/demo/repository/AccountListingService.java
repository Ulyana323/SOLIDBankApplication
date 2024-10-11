package com.example.demo.repository;

import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface AccountListingService {

    Account getClientAccount(String clientID, long AccountID);
    AccountWithdraw getClientWithdrawAccount(String clientID, long accountID);
    List<Account> getClientAccounts(String clientID);

    List <Account> getClientAccountsByType(String clientID, AccountType accountType);

}
