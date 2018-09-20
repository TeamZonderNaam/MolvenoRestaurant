package com.capgemini.service;

import java.util.List;

public interface Service<T> {
    boolean add(T item);
    List<T> get();
    T get(int i);
    T update(int i, T item);
    boolean delete(int i);
}
