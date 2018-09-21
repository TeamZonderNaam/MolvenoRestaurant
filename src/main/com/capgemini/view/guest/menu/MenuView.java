package com.capgemini.view.guest.menu;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;

import java.util.List;

public class MenuView extends View {
    private MenuItemService service;

    public MenuView(MenuItemService service) {
        this.service = service;
    }

    @Override
    public String stringDisplay() {
        String msg = "\nShowing all items";

        List<MenuItem> arr = service.get();
        if (arr.isEmpty()) {
            msg = "No items on the menu";
        }
        for (int i = 0; i < arr.size(); i ++) {
            MenuItem item = arr.get(i);
            msg += "\n"+(i+1)+" - "+item.getName() + " ------- Price ¥" + item.getPrice() + " ------- Number " + item.getNumber();
        }

        msg += "\n";
        return msg;
    }

    @Override
    public View handler(String action) {
        return null;
    }
}
