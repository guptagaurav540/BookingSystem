package com.BookingSyatem.BookingSystem.serviceImp;

import com.BookingSyatem.BookingSystem.entity.Transaction;
import com.BookingSyatem.BookingSystem.repository.TransactionRepository;
import com.BookingSyatem.BookingSystem.service.TransactionService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public Transaction createTransaction(String userId, Double amount, double payedAmount, double dueAmount) {
        try {
            Transaction transaction = new Transaction();
            transaction.setUserId(userId);
            transaction.setAmount(amount);
            transaction.setPayedAmount(payedAmount);
            transaction.setDueAmount(dueAmount);
            transaction.setStatus("SUCCESS");
            transactionRepository.save(transaction);
            return null;
        }
        catch (Exception e) {
            System.out.println("Failed to create transaction: " + e.getMessage());
            throw new RuntimeException();

        }
    }
    public Transaction getTransactionById(Long transactionId) {
        return transactionRepository.findByTransactionId(transactionId);
    }
    public Transaction updateTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
