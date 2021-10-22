package com.company.models;

public class Address {
    private String state;
    private String city;
    private String street;
    private int ZIP;

    public Address(String state, String city, String street, int ZIP) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.ZIP = ZIP;
    }
    public Address(Address address){
        this.state = address.state;
        this.city = address.city;
        this.street = address.street;
        this.ZIP = address.ZIP;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZIP() {
        return ZIP;
    }

    public void setZIP(int ZIP) {
        this.ZIP = ZIP;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state=" + getState() + '\n' +
                " city=" + getCity() + '\n' +
                " street=" + getStreet() + '\n' +
                " ZIP=" + getZIP();
    }
}


