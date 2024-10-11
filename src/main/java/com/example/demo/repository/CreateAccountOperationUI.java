package com.example.demo.repository;

import com.example.demo.entity.AccountType;
import org.springframework.stereotype.Component;

@Component
public interface CreateAccountOperationUI  {
     AccountType requestAccountType();

}
