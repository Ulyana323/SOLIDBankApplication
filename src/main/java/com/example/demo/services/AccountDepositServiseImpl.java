package com.example.demo.services;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountDAO;
import com.example.demo.repository.AccountDepositService;
import com.example.demo.entity.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountDepositServiseImpl implements AccountDepositService {
    AccountDAO accountDAO;

    @Override
    public void deposit(Account account, double amount) {
       account.setBalance(account.getBalance()+amount);
       accountDAO.updateAccount(account);
    }
}
