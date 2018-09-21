package com.capgemini.view.order;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;
import com.capgemini.service.MenuItemService;
import com.capgemini.service.OrderService;
import com.capgemini.view.driver.View;

public class GetSingleOrderView extends View {
    private OrderService service;
    private int id;

    public GetSingleOrderView(int id, OrderService service) {
        this.service = service;
        this.id = id;
    }

    @Override
    public String stringDisplay() {
        Order order = service.get(id);
        String msg = "\nShowing order";
        msg += "\nTable "+order.getTable().getNumber();
        msg += "\nItems:";
        for (MenuItem item : order.getItems()) {
            msg += "\n\t "+item.getName() + ", ¥"+item.getPrice();
        }
        msg += "\nTotal price: ¥" + order.getPrice();
        msg += "\n";
        return msg;
    }

    @Override
    public View handler(String action) {
        int id = Integer.parseInt(action);

        return new GetSingleOrderView(id, service);
    }
}
