package com.example.demo.services;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountDAO;
import com.example.demo.repository.AccountWithdrawService;
import com.example.demo.entity.AccountWithdraw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountWithdrawServiseImpl implements AccountWithdrawService {
    @Autowired
    AccountDAO accountDAO;

    @Override
    public void withdraw(double amount, Account account) {


        if(account.getBalance()-amount>=0 && account.IsWithdrawAllowed())
        {
          account.setBalance(account.getBalance()-amount);
            accountDAO.updateAccount(account);
        }

    }
}
