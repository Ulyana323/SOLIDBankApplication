package com.example.demo.services;

import com.example.demo.repository.AccountDAO;
import com.example.demo.repository.AccountWithdrawService;
import com.example.demo.entity.AccountWithdraw;
import org.springframework.stereotype.Component;

@Component
public class AccountWithdrawServiseImpl implements AccountWithdrawService {
    AccountDAO accountDAO;
    void Withdraw(double amount, AccountWithdraw account)
    {
        if(account.getBalance()-amount>=0)
        {

      accountDAO.getClientWithdrawAccount(account.getCLientID(), account.getId()).setBalance(account.getBalance()-amount);

    }
    }


    @Override
    public void withdraw(double amount, AccountWithdraw account) {


        if(account.getBalance()-amount>=0)
        {
          account.setBalance(account.getBalance()-amount);
            accountDAO.updateAccount(account);
        }

    }
}
