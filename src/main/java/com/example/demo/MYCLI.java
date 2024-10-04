package com.example.demo;

import java.util.Scanner;

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
    public String requestClientAmountNumber()//clientid
    {
        System.out.print("enter id: ");
        return scanner.next();
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
            case "Saving" -> {
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
