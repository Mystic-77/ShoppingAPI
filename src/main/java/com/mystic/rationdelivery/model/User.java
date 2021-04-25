package com.mystic.rationdelivery.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class User {


    @Id
    private String rationCardNumber;

    private String name;
    private String aadharNumber;
    private String dob;
    private String fingerPrintHash;

    private List<Order> orders;

    public User() {}

    public User(String rationCardNumber, String name, String aadharNumber, String dob, String fingerPrintHash) {
        this.rationCardNumber = rationCardNumber;
        this.name = name;
        this.aadharNumber = aadharNumber;
        this.dob = dob;
        this.fingerPrintHash = fingerPrintHash;
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

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getFingerPrintHash() {
        return fingerPrintHash;
    }

    public void setFingerPrintHash(String fingerPrintHash) {
        this.fingerPrintHash = fingerPrintHash;
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
                ", aadharNumber='" + aadharNumber + '\'' +
                ", dob='" + dob + '\'' +
                ", fingerPrintHash='" + fingerPrintHash + '\'' +
                ", orders=" + orders +
                '}';
    }
}
