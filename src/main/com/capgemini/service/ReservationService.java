package com.capgemini.service;

import com.capgemini.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationService implements Service<Reservation> {
    private List<Reservation> reservations;

    //constructor
    public ReservationService() {
        reservations = new ArrayList<>();
    }

    @Override
    public boolean add(Reservation item) {
        reservations.add(item);
        return true;
    }

    @Override
    public List<Reservation> get() {
        return this.reservations;
    }

    @Override
    public Reservation get(int id) {
        if (id >= 0 && id < reservations.size()) {
            return reservations.get(id);
        } else {
            return null;
        }
    }

    @Override
    public Reservation update(int id, Reservation changedOrder) {
        if (id >= 0 && id < reservations.size()) {
            reservations.set(id, changedOrder);
            return changedOrder;
        } else {
            return null;
        }
    }

    @Override
    public boolean delete(int id) {
        if (id >= 0 && id < reservations.size()) {
            return reservations.remove(id) != null;
        } else {
            return false;
        }
    }
}
