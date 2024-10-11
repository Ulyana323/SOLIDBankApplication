package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountDepositService;
import com.example.demo.repository.TransactionDAO;
import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransactionDeposit {

    AccountDepositService accountDepositService;
    TransactionDAO transactionDAO;
    void execute(Account account, double amount)
    {
       transactionDAO.addTransaction(new Transaction(amount,account.getId()));
       accountDepositService.deposit(account,amount);

    }
}
