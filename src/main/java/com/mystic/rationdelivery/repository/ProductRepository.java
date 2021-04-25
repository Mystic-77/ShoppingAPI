package com.mystic.rationdelivery.repository;

import com.mystic.rationdelivery.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    public void deleteProductByProductId(@Param("productId") String productId);
    public Product getProductByProductId(@Param("productId") String productId);
    public Product getProductByProductName(@Param("productName") String productName);
}
