package com.mystic.rationdelivery.model;

import org.springframework.data.annotation.Id;

public class Product
{
    @Id
    private String productId;

    private String productName;
    private double price;
    private String productImageURL;

    public Product() {}

    public Product(String productId, String productName, double price, String productImageURL) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productImageURL = productImageURL;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductImageURL() {
        return productImageURL;
    }

    public void setProductImageURL(String productImageURL) {
        this.productImageURL = productImageURL;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", productImageURL='" + productImageURL + '\'' +
                '}';
    }
}
