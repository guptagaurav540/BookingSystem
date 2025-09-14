package com.BookingSyatem.BookingSystem.service;

import com.BookingSyatem.BookingSystem.entity.Product;

public interface InventoryManagementService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product getProductById(Long id);
    void deleteProduct(Long id);
}
