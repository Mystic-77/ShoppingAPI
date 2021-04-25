package com.mystic.rationdelivery.controller;

import com.mystic.rationdelivery.model.Product;
import com.mystic.rationdelivery.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    DatabaseService databaseService;

    //has methods for CRUD of products

    @GetMapping("/products")
    public List<Product> allProducts() {
        return databaseService.getProductRepository().findAll();
    }

    @GetMapping("/products/{productId}")
    public Product getProduct(@PathVariable("productId") String productId) {
        return databaseService.getProductRepository().getProductByProductId(productId);
    }

    //add a new product
    @PostMapping("/products")
    public void addNewProduct(@RequestBody Product product) {
        databaseService.getProductRepository().save(product);
    }

    //edit a product
    @PutMapping("/products/{productId}")
    public void modifyProductDetails(@RequestBody Product product,
                                     @PathVariable("productId") String productId) {
        Product tempProduct = databaseService.getProductRepository().getProductByProductId(productId);
        databaseService.getProductRepository().delete(tempProduct);
        databaseService.getProductRepository().save(product);
    }

    //delete a product
    @DeleteMapping("/products/{productId}")
    public void deleteProduct(@PathVariable("productId") String productId) {
        databaseService.getProductRepository().deleteProductByProductId(productId);
    }
}
