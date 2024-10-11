package com.example.demo.controller;

import com.example.demo.entity.AccountType;
import com.example.demo.repository.AccountListingService;
import com.example.demo.repository.WithdrawDepositOperation;
import com.example.demo.entity.Account;
import com.example.demo.entity.AccountWithdraw;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class TransactionDepositCLI {

    TransactionDeposit transactionDeposit;
    WithdrawDepositOperation withdrawDepositOperation;
    AccountListingService accountListingService;


    public void depositMoney(String clientid)
    {
        WithdrawDepositOperation depos= withdrawDepositOperation;
        double sum= depos.requestClientAmount();
        if(sum<=0)
        {
            System.out.println("enter correct sum");
            return;
        }
        Account acc=new Account();
       if((acc=accountListingService.getClientAccount(clientid, depos.requestClientAccountNumber()))!=null)
       {
           transactionDeposit.execute(acc,sum);
           System.out.println("transaction succesfull");
       }


    }
}
