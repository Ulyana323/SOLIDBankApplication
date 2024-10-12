package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {

    private AccountType accountType;
    private long id;//уникальный для счета
    private String CLientID;//уникальный для клиента
    private double balance;
    private boolean withdrawAllowed;

    @Override
    public String toString() {
        return "clientid: "+this.CLientID+" accountid: "+this.getId()+" Account Type: "+this.getAccountType()+" Balance: "+this.getBalance();
    }

  public  boolean IsWithdrawAllowed()
    {//

        return withdrawAllowed;
    }


}
