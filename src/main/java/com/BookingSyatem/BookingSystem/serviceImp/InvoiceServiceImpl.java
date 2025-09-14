package com.BookingSyatem.BookingSystem.serviceImp;

import com.BookingSyatem.BookingSystem.entity.Invoice;
import com.BookingSyatem.BookingSystem.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl {
    @Autowired
    InvoiceRepository invoiceRepository;
    List<Invoice> addInvoices(List<Invoice> invoices){
        try {
            invoices = invoiceRepository.saveAll(invoices);
            return invoices;
        }catch (Exception e){
            throw new RuntimeException("Could not add invoices: " + e.getMessage());
        }
    }

}
