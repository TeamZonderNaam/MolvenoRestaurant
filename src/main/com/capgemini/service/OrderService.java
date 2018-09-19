package com.capgemini.service;

import com.capgemini.model.Order;

import java.util.List;

public class OrderService implements Service<Order> {
    private List<Order> orders;

    @Override
    public boolean add(Order item) {
        return true;
    }

    @Override
    public List<Order> get() {
        return orders;
    }

    @Override
    public Order get(int id) {
        //see comment in TableServiceTest
        return null;
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
            orders.remove(id);
            return true;
        } else {
            return false;
        }
    }
}
