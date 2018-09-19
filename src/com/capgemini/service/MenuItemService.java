package com.capgemini.service;

import com.capgemini.model.MenuItem;

import java.util.ArrayList;

public class MenuItemService implements Service<MenuItem> {
    public ArrayList<MenuItem> menuItemsList = new ArrayList<>();


    @Override
    public boolean add(MenuItem item) {
        menuItemsList.add(item);
        return true;
    }
}
