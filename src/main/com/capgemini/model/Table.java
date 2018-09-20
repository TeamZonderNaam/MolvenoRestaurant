package com.capgemini.model;

public class Table {

    private int numberPersons;
    private TableStatus status;
    //dit zou een list moeten worden
    private Reservation reservation;

    public Table(int numberPersons) {
        this.numberPersons = numberPersons;
    }

    //reserveringsfunctie maken

    //zou dit beter zijn met .isempty() ipv null?

    public TableStatus getStatus() {
        if (this.getReservation() != null) {
            this.status = TableStatus.BOOKED;
        }
        else {this.status = TableStatus.AVAILABLE;}
        return status;
    }

    //eventually reserve should return a boolean value, expressing if the guest is allowed to reserve the table
    public void reserveTable () {
        if (this.status == TableStatus.AVAILABLE) {
            this.status = TableStatus.BOOKED;
        }
        else {
            System.out.println("This table is not available.");
        }
    }

    public int getNumberPersons() {
        return numberPersons;
    }

//    public void setNumberPersons(int numberPersons) {
//        this.numberPersons = numberPersons;
//    }


    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
