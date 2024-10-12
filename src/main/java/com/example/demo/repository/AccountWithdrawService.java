package com.example.demo.repository;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountWithdraw;

public interface AccountWithdrawService {
    void withdraw(double amount, Account account);
}
