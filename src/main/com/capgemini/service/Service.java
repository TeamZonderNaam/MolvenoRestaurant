package com.capgemini.service;

import com.capgemini.model.MenuItem;

import java.util.List;

public interface Service<T> {
    boolean add(T item);
    List<T> get();
    T get(int i);
    T update(int i);
    boolean delete(int i);
}
