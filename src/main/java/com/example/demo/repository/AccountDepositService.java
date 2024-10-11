package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountWithdraw;

public interface AccountDepositService
{
    void deposit(Account account, double amount);
}
