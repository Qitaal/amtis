package com.example.amtis2;

public class Amtis {

    private int id;
    private String name;
    private String address;
    private String destination;
    private String date;

    public Amtis(int id, String name, String address, String destination, String date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.destination = destination;
        this.date = date;
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

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
