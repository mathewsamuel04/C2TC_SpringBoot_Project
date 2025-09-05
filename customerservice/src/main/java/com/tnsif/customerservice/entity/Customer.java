package com.tnsif.customerservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @Column(name = "C_id")
    private int c_id;

    @Column(name = "C_name")
    private String c_name;

    @Column(name = "Address")
    private String address;

    @Column(name = "Email")
    private String email;

    @Column(name = "Phone")
    private String phone;

    // Default constructor
    public Customer() {
        super();
    }

    // Parameterized constructor (with 5 fields)
    public Customer(int c_id, String c_name, String address, String email, String phone) {
        super();
        this.c_id = c_id;
        this.c_name = c_name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer [c_id=" + c_id + ", c_name=" + c_name + ", address=" + address 
                + ", email=" + email + ", phone=" + phone + "]";
    }
}
