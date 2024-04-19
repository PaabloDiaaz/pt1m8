package com.example;

/**
 * 
 *
 * @author pdiaz
 */
public class Hotel {

    private String name;
    private String address;
    private String web;
    private String category;

    /**
     * Constructs a new Hotel instance.
     *
     * @param name     The name of the hotel.
     * @param address  The address of the hotel.
     * @param web      The website of the hotel.
     * @param category The category of the hotel.
     */
    public Hotel(String name, String address, String web, String category) {
        this.name = name;
        this.address = address;
        this.web = web;
        this.category = category;
    }

    /**
     * Retrieves the name of the hotel.
     *
     * @return The name of the hotel.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the hotel.
     *
     * @param name The new name of the hotel.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the address of the hotel.
     *
     * @return The address of the hotel.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the hotel.
     *
     * @param address The new address of the hotel.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Retrieves the website of the hotel.
     *
     * @return The website of the hotel.
     */
    public String getWeb() {
        return web;
    }

    /**
     * Sets the website of the hotel.
     *
     * @param web The new website of the hotel.
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * Retrieves the category of the hotel.
     *
     * @return The category of the hotel.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category of the hotel.
     *
     * @param category The new category of the hotel.
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns a string representation of the hotel.
     *
     * @return A string representation of the hotel.
     */
    @Override
    public String toString() {
        return "Hotel [name=" + name + ", address=" + address + ", web=" + web + ", category=" + category + "]";
    }
}
