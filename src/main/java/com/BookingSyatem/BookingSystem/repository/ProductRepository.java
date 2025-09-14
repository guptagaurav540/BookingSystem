package com.BookingSyatem.BookingSystem.repository;

import com.BookingSyatem.BookingSystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByProductId(Long productId);
    Product getByProductName(String productName);

    Product getByProductId(Long productId  );

    void deleteByProductId(Long id);

}