package com.capgemini.view.employee.item;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;

import java.util.List;
import java.util.Scanner;

public class EditMenuItemView extends View {
    private MenuItemService service;

    public EditMenuItemView(MenuItemService service) {
        this.service = service;
    }

    private void editItem(int id ) {
        MenuItem item = service.get(id);
        String msg = "\nMenu Item";
        msg += "Name: "+item.getName()+"\n";
        msg += "Price: ¥"+item.getPrice()+"\n";
        msg += "Number: #"+item.getNumber()+"\n";
        msg += "\n";
        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        item = new MenuItem(name, price, number);
        service.update(id, item);
    }

    public String stringDisplay() {
        String msg = "\nShowing all items";

        List<MenuItem> arr = service.get();
        for (int i = 0; i < arr.size(); i ++) {
            MenuItem item = arr.get(i);
            msg += "\n"+(i+1)+" - Change: "+item.getName();
        }

        msg += "\n";
        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order to change: ");

        int id = scanner.nextInt() - 1;
        editItem(id);

        return "\nThe menu order has been added.";
    }

    public View handler(String action) {
        return this;
    }
}
