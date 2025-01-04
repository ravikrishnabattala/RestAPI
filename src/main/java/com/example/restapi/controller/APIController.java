package com.example.restapi.controller;

import com.example.restapi.model.Product;
import com.example.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {

    private ProductService productService;

    @Autowired
    public APIController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.productService.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return this.productService.getProduct(productId);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return this.productService.addProduct(product);
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product){
        return this.productService.updateProduct(product);
    }

    @DeleteMapping("/products/{productId}")
    public Product deleteProduct(@PathVariable int productId){
        return this.productService.deleteProduct(productId);
    }
}
