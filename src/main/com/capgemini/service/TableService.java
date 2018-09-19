package com.capgemini.service;

import com.capgemini.model.Table;

import java.util.ArrayList;
import java.util.List;

public class TableService implements Service<Table> {
    private List<Table> tables;

    public TableService() {
        tables = new ArrayList<>();
    }

    @Override
    public boolean add(Table item) {
        tables.add(item);
        // If it's database it could fail inserting, but not with a list
        // So just return `true` for now.
        return true;
    }

    @Override
    public List<Table> get() {
        return tables;
    }

    @Override
    public Table get(int id) {
        if (id >= 0 && id < tables.size()) {
            return tables.get(id);
        } else {
            return null;
        }
    }

    @Override
    public Table update(int id, Table item) {
        if (id >= 0 && id < tables.size()) {
            tables.set(id, item);
            return item;
        } else {
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        if (id >= 0 && id < tables.size()) {
            return tables.remove(id) != null;
        } else {
            return false;
        }
    }
}
