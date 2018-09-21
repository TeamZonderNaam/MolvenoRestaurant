package com.capgemini.view.employee.item;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;

import java.util.Scanner;

public class AddMenuItemView extends View {
    private MenuItemService service;

    public AddMenuItemView(MenuItemService service) {
        this.service = service;
    }

    private void addItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        MenuItem item = new MenuItem(name, price, number);
        service.add(item);
    }

    public String stringDisplay() {
        addItem();
        return "\nThe menu order has been added.";
    }

    public View handler(String action) {
        return this;
    }
}
