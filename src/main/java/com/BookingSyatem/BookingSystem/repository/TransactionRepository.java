package com.BookingSyatem.BookingSystem.repository;

import com.BookingSyatem.BookingSystem.entity.Product;
import com.BookingSyatem.BookingSystem.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
    Transaction findByTransactionId(Long transactionId);
}
