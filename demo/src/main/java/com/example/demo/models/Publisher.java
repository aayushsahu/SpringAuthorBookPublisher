package com.example.demo.models;

public class Publisher {
    private Long id;
    private String publisherName;
    private String address;

    public Publisher(String publisherName, String address) {
        this.publisherName = publisherName;
        this.address = address;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
