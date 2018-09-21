package com.capgemini.view.employee.order;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;
import com.capgemini.service.OrderService;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.List;
import java.util.Scanner;

public class EditOrderView extends View {
    private OrderService service;

    public EditOrderView(OrderService service) {
        this.service = service;
    }

    private void printItems() {
        String msg = "";
        List<MenuItem> items = Window.menuItemService.get();
        for (int i = 0; i < items.size(); i ++) {
            MenuItem item = items.get(i);
            msg += "\n"+(i+1)+" - "+item.getName()+" ¥"+item.getPrice();
        }

        System.out.println(msg);
    }

    private MenuItem getItem(int id) {
        return Window.menuItemService.get(id);
    }


    private void editOrder(int id ) {
        printItems();
        System.out.print("Enter item to add: ");
        Scanner scanner = new Scanner(System.in);
        MenuItem item = getItem(scanner.nextInt() - 1);

        Order order = service.get(id);
        order.getItems().add(item);
    }

    public String stringDisplay() {
        String msg = "\nWhich order should be used?";
        List<Order> orders = service.get();
        for (int i = 0; i < orders.size(); i ++) {
            Order order = orders.get(i);
            msg += "\n"+(i+1)+" - Order for table "+order.getTable().getNumber() +", total price: ¥"+order.getPrice();
        }

        msg += "\n";
        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order to change: ");

        int id = scanner.nextInt() - 1;
        editOrder(id);

        return "\nThe item has been added to order.";
    }

    public View handler(String action) {
        return this;
    }
}
