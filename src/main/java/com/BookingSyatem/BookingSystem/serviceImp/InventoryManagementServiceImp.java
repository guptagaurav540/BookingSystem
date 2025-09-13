package com.BookingSyatem.BookingSystem.serviceImp;

import com.BookingSyatem.BookingSystem.entity.Product;
import com.BookingSyatem.BookingSystem.repository.ProductRepository;
import com.BookingSyatem.BookingSystem.service.InventoryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryManagementServiceImp implements InventoryManagementService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        if(productRepository.getByProductName(product.getProductName()) != null){
            Product existingProduct = productRepository.getByProductName(product.getProductName());
            existingProduct.setStockQuantity(existingProduct.getStockQuantity() + product.getStockQuantity());
            return productRepository.save(existingProduct);
        }
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.getByProductId(product.getProductId());
        existingProduct.setStockQuantity(existingProduct.getStockQuantity() + product.getStockQuantity());
        return productRepository.save(existingProduct);

    }

    @Override
    public Product getProductById(String id) {
        return productRepository.getByProductId(id);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteByProductId(id);

    }
}
