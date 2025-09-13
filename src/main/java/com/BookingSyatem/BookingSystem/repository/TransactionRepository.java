package com.BookingSyatem.BookingSystem.repository;

import com.BookingSyatem.BookingSystem.entity.Product;
import com.BookingSyatem.BookingSystem.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<Transaction, String>{
    Transaction findByTransactionId(String transactionId);
}
