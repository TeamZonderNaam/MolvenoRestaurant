package com.capgemini.service;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Table;

import java.util.ArrayList;
import java.util.List;

public class MenuItemService implements Service<MenuItem> {
    private ArrayList<MenuItem> menuItemsList = new ArrayList<>();


    @Override
    public boolean add(MenuItem item) {
        menuItemsList.add(item);
        return true;
    }

    @Override
    public List<MenuItem> get() {
        return menuItemsList;
    }

    @Override
    public MenuItem get(int i) {
        return null;
    }

    @Override
    public MenuItem update(int i) {
        return null;
    }

    @Override
    public boolean delete(int i) {
        return false;
    }
}
