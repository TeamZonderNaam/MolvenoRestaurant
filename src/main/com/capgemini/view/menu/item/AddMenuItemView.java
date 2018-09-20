package com.capgemini.view.menu.item;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.MenuItemService;
import com.capgemini.service.TableService;
import com.capgemini.view.driver.View;

import java.util.Scanner;

public class AddMenuItemView extends View {
    private MenuItemService service;
    private boolean sec = false;

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

        sec = true;
    }

    public String stringDisplay() {
        addItem();
        return "\nThe menu item has been added.";
    }

    public View handler(String action) {
        return this;
    }
}
