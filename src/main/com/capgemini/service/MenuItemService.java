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
        if (i >= 0 && i < menuItemsList.size()) {
            return menuItemsList.get(i);
        } else {
            return null;
        }
    }

    @Override
    public MenuItem update(int id, MenuItem item) {
        if(id >= 0 && id < menuItemsList.size()){
            menuItemsList.set(id, item);
            return item;
        }else{
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        if (id >= 0 && id < menuItemsList.size()) {
            return menuItemsList.remove(id) != null;
        } else {
            return false;
        }
    }
}
