package com.example;

public class Hotel {

    private String name;

    private String address;

    private String web;

    private HotelCategory category;

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

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public HotelCategory getCategory() {
        return category;
    }

    public void setCategory(HotelCategory category) {
        this.category = category;
    }

    public Hotel(String name, String address, String web, HotelCategory category) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.category = category;
    }

    

    
}
