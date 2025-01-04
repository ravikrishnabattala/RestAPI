package com.example.restapi.service;

import com.example.restapi.model.Product;
import com.example.restapi.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;


    public Product getProduct(int productId) {
        return this.repo.findById(productId).orElse(new Product(500,"No Item",0000));
    }

    public Product addProduct(Product product) {
        return this.repo.save(product);
    }

    public Product updateProduct(Product product) {
        if(this.getProduct(product.getProdId()).getProdId()!=500) {
            return this.repo.save(product);
        }
        else{
            return new Product(500,"No Item",0000);
        }
    }

    public Product deleteProduct(int productId) {
        Product product = this.getProduct(productId);
        this.repo.deleteById(productId);
        return  product;
    }

    public List<Product> getProducts() {
        return this.repo.findAll();
    }
}
