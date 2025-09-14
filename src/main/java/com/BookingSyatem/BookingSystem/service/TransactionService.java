package com.BookingSyatem.BookingSystem.service;

import com.BookingSyatem.BookingSystem.entity.Transaction;

public interface TransactionService {
    Transaction createTransaction(Long userId, Double amount, double payedAmount, double dueAmount);
}
