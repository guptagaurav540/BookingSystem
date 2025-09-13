package com.BookingSyatem.BookingSystem.repository;

import com.BookingSyatem.BookingSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByProductId(String productId);
    Product getByProductName(String productName);

    Product getByProductId(String productId  );

    void deleteByProductId(String id);

}