package com.capgemini.service;

import com.capgemini.model.MenuItem;

public interface Service<T> {
    boolean add(T item);
}
