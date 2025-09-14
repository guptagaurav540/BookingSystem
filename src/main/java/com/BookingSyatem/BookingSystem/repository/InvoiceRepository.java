package com.BookingSyatem.BookingSystem.repository;

import com.BookingSyatem.BookingSystem.entity.Invoice;
import com.BookingSyatem.BookingSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    Optional<Invoice> findByInvoiceId(Long invoiceId);
    Invoice getByInvoiceId(Long invoiceId);
    void deleteByTransactionId(Long id);
    Optional<Invoice> findByTransactionId(Long invoiceId);

}