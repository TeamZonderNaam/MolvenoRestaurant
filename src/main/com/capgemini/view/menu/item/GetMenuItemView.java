package com.capgemini.view.menu.item;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.ArrayList;
import java.util.List;

public class GetMenuItemView extends View {
    private MenuItemService service;

    public GetMenuItemView(MenuItemService service) {
        this.service = service;

        this.service.add(new MenuItem("Lorem", 10, 1));
        this.service.add(new MenuItem("Ipsum", 12, 2));
        this.service.add(new MenuItem("Doler", 13, 3));
    }

    @Override
    public String stringDisplay() {
        String msg = "\nShowing all items";

        List<MenuItem> arr = service.get();
        for (int i = 0; i < arr.size(); i ++) {
            MenuItem item = arr.get(i);
            msg += "\n"+(i+1)+" - View: "+item.getName();
        }

        msg += "\n";
        return msg;
    }

    @Override
    public View handler(String action) {
        int id = Integer.parseInt(action);

        return new GetSingleMenuItemView(id - 1, service);
    }
}
