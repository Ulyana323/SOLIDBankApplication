package com.example.demo.repository;

import com.example.demo.entity.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TransactionDAO {
    List<Transaction> getTransaction(Transaction transaction);
   void addTransaction(Transaction transaction);
}
