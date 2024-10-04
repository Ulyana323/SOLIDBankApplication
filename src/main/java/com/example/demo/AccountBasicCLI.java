package com.example.demo;

public class AccountBasicCLI {
    CreateAccountOperationUI createAccountOperationUI;
    BankCore bankCore;
    AccountListingService accountListing;

    public AccountBasicCLI(CreateAccountOperationUI createAccountOperationUI,BankCore bankCore,AccountListingService accountListing)

    {
        this.createAccountOperationUI=createAccountOperationUI;
        this.bankCore=bankCore;
        this.accountListing=accountListing;
    }


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
    void getAcccounts(String clientID)
    {
        System.out.println(accountListing.getClientAccounts(clientID));

    }
}
