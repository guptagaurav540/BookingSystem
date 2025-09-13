package com.BookingSyatem.BookingSystem.service;

import com.BookingSyatem.BookingSystem.entity.Transaction;

public interface TransactionService {
    Transaction createTransaction(String userId, String amount, double payedAmount, double dueAmount);
}
