package com.capgemini.model;

public class MenuItem {

    private String name;
    private double price;
    private int number;

    public MenuItem(String name, double price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }

    //empty constructor for easy constructing of menu items
    public MenuItem() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
