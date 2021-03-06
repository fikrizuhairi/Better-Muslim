package com.alexvasilkov.foldablelayout.sample.activities;

import java.io.Serializable;

/**
 * Created by Fikri Zuhairi on 26/4/2018.
 */

public class Customer implements Serializable {

    public static final String TAG = "Customer";

    private long id;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
