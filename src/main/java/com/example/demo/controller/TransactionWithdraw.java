package com.example.demo.controller;

import com.example.demo.repository.AccountWithdrawService;
import com.example.demo.repository.TransactionDAO;
import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionWithdraw {

    AccountWithdrawService accountWithdrawService;
    TransactionDAO transactionDAO;

    public void execute(double sum, AccountWithdraw acc)
    {

        transactionDAO.addTransaction(new Transaction(sum,acc.getId()));
        accountWithdrawService.withdraw(sum,acc);



    }

}
