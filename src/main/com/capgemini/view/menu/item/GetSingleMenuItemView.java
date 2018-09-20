package com.capgemini.view.menu.item;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import com.capgemini.view.driver.View;

import java.util.List;

public class GetSingleMenuItemView extends View {
    private MenuItemService service;
    private int id;

    public GetSingleMenuItemView(int id, MenuItemService service) {
        this.service = service;
        this.id = id;
    }

    @Override
    public String stringDisplay() {
        MenuItem item = service.get(id);
        String msg = "\nShowing Menu Item";
        msg += "Name: "+item.getName()+"\n";
        msg += "Price: ¥"+item.getPrice()+"\n";
        msg += "Number: #"+item.getNumber()+"\n";
        msg += "\n";
        return msg;
    }

    @Override
    public View handler(String action) {
        int id = Integer.parseInt(action);

        return new GetSingleMenuItemView(id, service);
    }
}
