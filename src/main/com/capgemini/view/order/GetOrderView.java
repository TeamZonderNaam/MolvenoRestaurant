package com.capgemini.view.order;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.MenuItemService;
import com.capgemini.service.OrderService;
import com.capgemini.view.driver.View;

import java.util.ArrayList;
import java.util.List;

public class GetOrderView extends View {
    private OrderService service;

    public GetOrderView(OrderService service) {
        this.service = service;
    }

    @Override
    public String stringDisplay() {
        String msg = "\nShowing all orders";

        List<Order> arr = service.get();
        for (int i = 0; i < arr.size(); i ++) {
            Order order = arr.get(i);
            msg += "\n"+(i+1)+" - Order for table "+order.getTable().getNumber()+", total price: ¥"+order.getPrice();
        }

        msg += "\n";
        return msg;
    }

    @Override
    public View handler(String action) {
        int id = Integer.parseInt(action);

        return new GetSingleOrderView(id - 1, service);
    }
}
