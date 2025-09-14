package com.BookingSyatem.BookingSystem.entity;

import jakarta.persistence.*;
import jdk.jfr.Description;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Description("Unique identifier for the product")
    @Column(name = "product_id", nullable = false, unique = true)
    private Long productId;

    @Description("Name of the product")
    @Column(name = "product_name", nullable = false)
    private String productName;

    @Description("Detailed description of the product")
    @Column(name = "description")
    private String description;

    @Description("Price of the product")
    @Column(name = "price", nullable = false)
    private double price;

    @Description("Available stock quantity of the product")
    @Column(name = "stock_quantity", nullable = false)
    private int stockQuantity;

    @Description("Category to which the product belongs")
    @Column(name = "category")
    private String category;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getExpieryDate() {
        return expieryDate;
    }

    public void setExpieryDate(Date expieryDate) {
        this.expieryDate = expieryDate;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    @Description("Expiry date of the product, if applicable")
    @Column(name = "expiry_date")
    Date expieryDate;

    @Description("Selling price of the product")
    @Column(name = "selling_price", nullable = false)
    double sellingPrice;
}
