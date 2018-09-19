package com.capgemini.service;

import com.capgemini.model.MenuItem;

import java.util.List;

public class MenuItemService implements Service<MenuItem> {
    @Override
    public boolean add(MenuItem item) {
        return false;
    }

    @Override
    public List<MenuItem> get() {
        return null;
    }

    @Override
    public MenuItem get(int id) {
        return null;
    }

    @Override
    public MenuItem update(int id, MenuItem item) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
