package com.example.demo.controller;

import com.example.demo.entity.AccountType;
import com.example.demo.repository.AccountListingService;
import com.example.demo.repository.CreateAccountOperationUI;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountBasicCLI {
    @Autowired
    CreateAccountOperationUI createAccountOperationUI;
    @Autowired
    BankCore bankCore;
    @Autowired
    AccountListingService accountListingService;


    public void createAccountRequest(String clientID)
    {
        CreateAccountOperationUI myCLI= createAccountOperationUI;

        AccountType accountType= myCLI.requestAccountType();


        if(accountType==null){
            System.out.println("enter correct type");
            return;
        }
        bankCore.createNewAccount(accountType,clientID);

        System.out.println("bank account created");

    }
    public void getAcccounts(String clientID)
    {
        //System.out.println(accountListingService.getClientAccounts(clientID));

        if(accountListingService.getClientAccounts(clientID)==null)
        {
            System.out.println("no accounts here");
            return;
        }
        accountListingService.getClientAccounts(clientID).forEach(System.out::println);
    }
}
