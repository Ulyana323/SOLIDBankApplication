package com.example.demo.services;

import com.example.demo.repository.TransactionDAO;
import com.example.demo.entity.Transaction;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class MemoryTransactionDAO implements TransactionDAO {
    Set<Transaction> transactions;

    {
        transactions=new HashSet<Transaction>();
    }
    @Override
    public List<Transaction> getTransaction(Transaction transaction) {
       if(transactions.contains(transaction))
       {
           return transactions.stream().filter(x->x.equals(transaction)).toList();
       }
       else
           return null;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        if(transactions.contains(transaction))
        {
            return;
        }else
        {
            transactions.add(transaction);

        }

    }
}
