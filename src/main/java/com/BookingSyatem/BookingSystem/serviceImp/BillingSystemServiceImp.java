package com.BookingSyatem.BookingSystem.serviceImp;

import com.BookingSyatem.BookingSystem.entity.Invoice;
import com.BookingSyatem.BookingSystem.entity.Product;
import com.BookingSyatem.BookingSystem.entity.Transaction;
import com.BookingSyatem.BookingSystem.entity.User;
import com.BookingSyatem.BookingSystem.repository.InvoiceRepository;
import com.BookingSyatem.BookingSystem.repository.ProductRepository;
import com.BookingSyatem.BookingSystem.repository.TransactionRepository;
import com.BookingSyatem.BookingSystem.repository.UserRepository;
import com.BookingSyatem.BookingSystem.service.UserManagement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingSystemServiceImp {
    @Autowired
    private UserManagement userManagement;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private TransactionRepository transactionRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;

    public Transaction processTransaction(User user, List<Invoice> invoiceList, double payedAmount) {
        // Check if user exists, else create
        User persistedUser = userManagement.createUser(user);


        // Create transaction
        Transaction transaction = new Transaction();
        transaction.setUserId(persistedUser.getUserId());
        double totalAmount = invoiceList.stream().mapToDouble(Invoice::getSellingPrice).sum();
        transaction.setAmount(totalAmount);
        transaction.setPayedAmount(payedAmount);
        transaction.setDueAmount(totalAmount-payedAmount);
        transaction = transactionRepository.save(transaction);
        // Create invoices and link to transaction
        for(Invoice invoice:invoiceList)
        {
            invoice.setTransactionId(transaction.getTransactionId());
        }

        invoiceRepository.saveAll(invoiceList);

        return transaction;
    }

}
