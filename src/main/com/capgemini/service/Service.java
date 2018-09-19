package com.capgemini.service;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Table;

import java.util.List;

public interface Service<T> {
    boolean add(T item);
    List<T> get();
    T get(int id);
    T update(int id, T item);
    boolean delete(int id);
}
