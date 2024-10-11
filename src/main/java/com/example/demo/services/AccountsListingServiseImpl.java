package com.example.demo.services;

import com.example.demo.repository.AccountDAO;
import com.example.demo.repository.AccountListingService;
import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountsListingServiseImpl implements AccountListingService {
   private final AccountDAO accountDAO;
    @Override
    public Account getClientAccount(String clientID, long AccountID) {
       return accountDAO.getClientAccount(clientID,AccountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, long accountID) {
        return accountDAO.getClientWithdrawAccount(clientID,accountID);
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        return accountDAO.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return accountDAO.getCientAccountsByType(clientID,accountType);
    }
}

