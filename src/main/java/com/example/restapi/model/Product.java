package com.example.restapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;


@Component
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    @NotBlank
    private String productName;
    @Min(value = 1,message = "greater than 1")
    private int price;

    public Product(int prodId, String productName, int price) {
        this.prodId = prodId;
        this.productName = productName;
        this.price = price;
    }

    public Product(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public Product() {
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodId=" + prodId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
