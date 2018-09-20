package com.capgemini.view.menu.item;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;

import java.util.List;
import java.util.Scanner;

public class DeleteMenuItemView extends View {
    private MenuItemService service;

    public DeleteMenuItemView(MenuItemService service) {
        this.service = service;
    }

    @Override
    public String stringDisplay() {
        String msg = "\nWhich item should be removed?";

        List<MenuItem> arr = service.get();
        for (int i = 0; i < arr.size(); i ++) {
            MenuItem item = arr.get(i);
            msg += "\n"+(i+1)+" - "+item.getName();
        }

        msg += "\n";
        System.out.println(msg);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number of item to be removed: ");

        int id = scanner.nextInt();
        service.delete(id);

        msg = "\nSuccessfully deleted item";
        return msg;
    }

    @Override
    public View handler(String action) {
        return this;
    }
}

