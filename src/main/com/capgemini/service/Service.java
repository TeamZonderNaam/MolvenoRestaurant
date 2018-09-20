package com.capgemini.service;

import java.util.List;

public interface Service<T> {
    boolean add(T item);
    List<T> get();
    T get(int id);
    T update(int id, T item);
    boolean delete(int id);
}