package com.example.demo.controller;

import com.example.demo.entity.Account;
import com.example.demo.entity.AccountType;
import com.example.demo.repository.WithdrawDepositOperation;
import com.example.demo.entity.AccountWithdraw;
import com.example.demo.services.AccountsListingServiseImpl;
import lombok.AllArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@ComponentScan(basePackages = "com.example.demo")
public class TransactionWithdrawCLI {

    WithdrawDepositOperation withdrawDepositOperation;
    TransactionWithdraw transactionWithdraw;
    AccountsListingServiseImpl accountsListingServise;
    public void withdrawMoney(String ClientID)
    {
        WithdrawDepositOperation mycli= withdrawDepositOperation;
        double sum= mycli.requestClientAmount();
        long id= mycli.requestClientAccountNumber();
        Account acc=new AccountWithdraw();
        if((acc=accountsListingServise.getClientWithdrawAccount(ClientID,id))==null)
        {
            System.out.println("transaction can't be done");
        }///ublic  boolean IsWithdrawAllowed() использовать

        transactionWithdraw.execute(sum,(AccountWithdraw) acc);
        System.out.println("transaction succesfull");

    }
}
