package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountWithdrawService;
import com.example.demo.repository.TransactionDAO;
import com.example.demo.entity.AccountWithdraw;
import com.example.demo.entity.Transaction;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TransactionWithdraw {

    @Autowired
    AccountWithdrawService accountWithdrawService;
    @Autowired
    TransactionDAO transactionDAO;

    public void execute(double sum, Account acc)
    {

        transactionDAO.addTransaction(new Transaction(sum,acc.getId()));
        accountWithdrawService.withdraw(sum,acc);



    }

}
