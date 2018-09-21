package com.capgemini.view.employee.order;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Order;
import com.capgemini.model.Table;
import com.capgemini.service.OrderService;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddOrderView extends View {
    private OrderService service;

    public AddOrderView(OrderService service) {
        this.service = service;
    }

    private void printTables() {
        String msg = "Tables:";

        List<Table> tables = Window.myTableService.get();
        for (int i = 0; i < tables.size(); i ++) {
            Table table = tables.get(i);
            msg += "\n\t"+(i + 1)+" - Table " + table.getNumber()+" for " + table.getNumberPersons()+" people";
        }

        System.out.println(msg);
    }

    private Table getTable(int id) {
        return Window.myTableService.get(id);
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

    private void addOrder() {
        Scanner scanner = new Scanner(System.in);

        printTables();
        System.out.print("Enter the table: ");
        Table table = getTable(
            scanner.nextInt() - 1
        );

        printItems();
        System.out.print("Enter the item: ");
        MenuItem item = getItem(
            scanner.nextInt() - 1
        );
        List<MenuItem> items = new ArrayList<>();
        items.add(item);

        Order order = new Order();
        order.setTable(table);
        order.setItems(items);
        service.add(order);
    }

    public String stringDisplay() {
        addOrder();
        return "\nThe order has been added.";
    }

    public View handler(String action) {
        return this;
    }
}
