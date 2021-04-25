package com.mystic.rationdelivery.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {


    @Id
    private String rationCardNumber;

    private String name;
    private String aadhaarNumber;
    private String dob;
    private String password;
    private List<Order> orders;

    public User() {}

    public User(String rationCardNumber, String name, String aadhaarNumber, String dob, String password) {
        this.rationCardNumber = rationCardNumber;
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.dob = dob;
        this.password = password;
    }

    public String getRationCardNumber() {
        return rationCardNumber;
    }

    public void setRationCardNumber(String rationCardNumber) {
        this.rationCardNumber = rationCardNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFingerPrintHash() {
        return password;
    }

    public void setFingerPrintHash(String password) {
        this.password = password;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "rationCardNumber='" + rationCardNumber + '\'' +
                ", name='" + name + '\'' +
                ", aadhaarNumber='" + aadhaarNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", fingerPrintHash='" + password + '\'' +
                ", orders=" + orders +
                '}';
    }
}
