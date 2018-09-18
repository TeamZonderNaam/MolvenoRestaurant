package com.capgemini.model;

public class MenuItem {
    public MenuItem(){}

    private String itemName;
    private int price;
    private int itemNumber;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
