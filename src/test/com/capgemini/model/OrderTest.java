package com.capgemini.model;

import com.capgemini.service.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;

    private MenuItem item1 = new MenuItem();
    private MenuItem item2 = new MenuItem();
    private MenuItem item3 = new MenuItem();
    private MenuItem item4 = new MenuItem();

    @BeforeEach
    public void init() { order = new Order(); }

    @Test
    public void getPrice() {
        //check whether function starts with price at 0 when no items are added yet
        assertTrue(order.getPrice() == 0);

        //make some items with prices
        item1.setPrice(5);
        item2.setPrice(6);
        item3.setPrice(7);
        item4.setPrice(9);

        //fill order with items
        order.getItems().add(item1);
        order.getItems().add(item2);
        order.getItems().add(item3);
        order.getItems().add(item4);

        //check if the order gives the expected outcome
        assertEquals(27, order.getPrice());

        //check if the order doesn't give an unexpected outcome
        assertNotEquals(28, order.getPrice());

        //check if the price is not below zero
        assertTrue(order.getPrice() > 0);

    }

    @Test
    public void showOrder() {
        //check whether function starts with an empty string when no items are added yet
        assertTrue(order.showOrder() == "");

        //make some items with names
        item1.setName("pizza");
        item2.setName("pasta");
        item3.setName("chocolate mousse");
        item4.setName("foe yong hai");

        //fill order with items
        order.getItems().add(item1);
        order.getItems().add(item2);
        order.getItems().add(item3);
        order.getItems().add(item4);

        //make a string of the expected outcome
        String orderOverview = "pizza\npasta\nchocolate mousse\nfoe yong hai";

        //check whether this string matches the actual outcome
        assertEquals(orderOverview, order.showOrder());
    }
}
