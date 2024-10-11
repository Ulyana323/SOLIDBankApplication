package com.example.demo.repository;

import com.example.demo.entity.AccountWithdraw;

public interface AccountWithdrawService {
    void withdraw(double amount, AccountWithdraw account);
}
