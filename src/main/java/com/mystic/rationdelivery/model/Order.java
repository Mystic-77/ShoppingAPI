package com.mystic.rationdelivery.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Order {

    @Id
    private String orderId;

    private User buyer;
    private List<Product> products;
    private List<Integer> quantities;
    private String date;
    private boolean inCart;

    public Order() {}

    public Order(String orderId, User buyer, List<Product> products, List<Integer> quantities, String date, boolean inCart) {
        this.orderId = orderId;
        this.buyer = buyer;
        this.products = products;
        this.quantities = quantities;
        this.date = date;
        this.inCart = inCart;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isInCart() {
        return inCart;
    }

    public void setInCart(boolean inCart) {
        this.inCart = inCart;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", buyer=" + buyer +
                ", products=" + products +
                ", quantities=" + quantities +
                ", date='" + date + '\'' +
                ", inCart=" + inCart +
                '}';
    }
}
