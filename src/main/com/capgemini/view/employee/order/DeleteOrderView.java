package com.capgemini.view.employee.order;

import com.capgemini.model.Order;
import com.capgemini.service.OrderService;
import com.capgemini.view.driver.View;

import java.util.List;
import java.util.Scanner;

public class DeleteOrderView extends View {
    private OrderService service;

    public DeleteOrderView(OrderService service) {
        this.service = service;
    }

    @Override
    public String stringDisplay() {
        String msg = "\nWhich order should be removed?";
        List<Order> orders = service.get();
        for (int i = 0; i < orders.size(); i ++) {
            Order order = orders.get(i);
            msg += "\n"+(i+1)+" - Order for table "+order.getTable().getNumber() +", total price: ¥"+order.getPrice();
        }

        msg += "\n";
        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of order to be removed: ");

        int id = scanner.nextInt();
        service.delete(id - 1);

        msg = "\nSuccessfully deleted order";
        return msg;
    }

    @Override
    public View handler(String action) {
        return this;
    }
}

