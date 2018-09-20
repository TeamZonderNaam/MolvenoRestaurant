package com.capgemini.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;
    private Table table;
    //it would be ideal if you could set this property for every individual order of the order
    private boolean prepared;
    //this variable should be composed of the separate prices of every menu-order
    private int totalPrice;

    //define a constructor that automatically makes an arraylist when making a new Order
    public Order() {
        items = new ArrayList<>();
    }

    public List<MenuItem> getItems() {
        return this.items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public double getPrice() {
        double price = 0;
        for (MenuItem i : items) {
            price = price + i.getPrice();
        }
        return price;
    }

    public void setPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    //should we make this into a void function just printing the order?
    public String showOrder() {
        //Here we should give back the name or number of the table
        String itemList = "";
        for (int i = 0; i < items.size(); i++) {
            itemList += items.get(i).getName();
            if (i < items.size()-1) {
                itemList += "\n";
            }
        }
        return itemList;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public boolean isPrepared() {
        return prepared;
    }

    public void setPrepared(boolean prepared) {
        this.prepared = prepared;
    }

}
