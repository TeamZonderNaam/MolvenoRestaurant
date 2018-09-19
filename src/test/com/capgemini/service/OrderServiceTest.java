package com.capgemini.service;

import com.capgemini.model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class OrderServiceTest {
    private OrderService service;
    private Order order1 = new Order();
    private Order order2 = new Order();
    private Order order3 = new Order();

    //initialize a new service before each test
    @BeforeEach
    public void init() {
        service = new OrderService();
    }

    @Test
    public void get() {
        service.add(order1);
        service.add(order2);
        service.add(order3);

        List<Order> orders = service.get();
        assertEquals(3, orders.size());

        assertSame(orders.get(0), order1);
        assertSame(orders.get(1), order2);
        assertSame(orders.get(2), order3);


    }

    @Test
    public void getId() {

        //I did not understand yet what exactly the ID should be. I assumed it would be the number of the order, but I
        // looked at the test definition in TableServiceTest but it seems to be the same test as for the get-method

    }

    @Test
    public void add() {
        boolean ok = service.add(order1);
        assertTrue(ok);
        assertEquals(1, service.get().size());

    }

    @Test
    public void update() {
        service.add(order1);
        service.add(order2);
        service.add(order3);

        Order fakeOrder = new Order();

        service.update(0, fakeOrder);

        assertSame(service.get(0), fakeOrder);

        assertNull(service.update(4, fakeOrder));
        assertNull(service.update(-1, fakeOrder));


    }

    @Test
    public void delete() {
        service.add(order1);
        service.add(order2);
        service.add(order3);

        service.delete(0);

        assertSame(service.get(0), order2);
        assertSame(service.get(1), order3);

        assertEquals(2, service.get().size());

        assertNull(service.get(3));
        assertNull(service.get(-1));




    }
}
