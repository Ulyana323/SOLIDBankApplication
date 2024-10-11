package com.example.demo.controller;

import com.example.demo.entity.AccountType;
import com.example.demo.repository.CLIUI;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MYCLI implements CLIUI {
   private final Scanner scanner;


   public MYCLI()
    {
        this.scanner=new Scanner(System.in);
        System.out.println("welcome ...");

    }
    public Scanner getScanner() {
        return scanner;
    }
    public MYCLI(Scanner scanner)
    {
        this.scanner=scanner;
    }
    public double requestClientAmount()//balance
    {
        System.out.print("enter balance: ");
        return scanner.nextDouble();
    }
    public long requestClientAccountNumber()//account_id
    {
        System.out.print("enter account id: ");
        return scanner.nextLong();
    }
    public AccountType requestAccountType()
    {
        System.out.print("enter account type [Checking, Saving, Fixed] ");
        String chosen=scanner.next().toUpperCase();
        switch(chosen)
        {
            case "CHECKING" -> {
                return AccountType.Checking;
            }
                case "SAVING" -> {
                return AccountType.Saving;
            }
            case "FIXED" -> {
                return AccountType.Fixed;
            }
            default -> {
                return null;
            }
        }
    }
}
