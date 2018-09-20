package com.capgemini.service;

import com.capgemini.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderService implements Service<Order> {
    private List<Order> orders;

    //constructor
    public OrderService() {
        orders = new ArrayList<>();
    }

    @Override
    public boolean add(Order item) {
        orders.add(item);
        return true;
    }

    @Override
    public List<Order> get() {
        return this.orders;
    }

    @Override
    public Order get(int id) {
        if (id >= 0 && id < orders.size()) {
            return orders.get(id);
        } else {
            return null;
        }
    }

    @Override
    public Order update(int id, Order changedOrder) {
        //check if the id is within the range of the order list
        if (id >= 0 && id < orders.size()) {
            //in the example of TableService, this was achieved with a set function, but this is not defined yet.
            // Or is it a standard method of lists?
            orders.set(id, changedOrder);
            return changedOrder;
        } else {
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        //check if ID falls within the range
        if (id >= 0 && id < orders.size()) {
            //in the example TableService this only returns a boolean, but it seems like nothing is deleted there?
            return orders.remove(id) != null;
        } else {
            return false;
        }
    }
}
