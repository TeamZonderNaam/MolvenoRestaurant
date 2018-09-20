package com.capgemini.model;

public class Table {
    private int number;

    private int numberPersons;
    private TableStatus status;
    //dit zou een list moeten worden
    private Reservation reservation;

    public Table(int numberPersons) {
        this.numberPersons = numberPersons;
        this.status = TableStatus.AVAILABLE;
    }
  
  
    public Table(TableStatus status, int numberPersons) {
        this.status = status;
        this.numberPersons = numberPersons;
    }

    public Table(int number, TableStatus status, int numberPersons) {
        this.number = number;
        this.status = status;
        this.numberPersons = numberPersons;
    }


    //reserveringsfunctie maken: als er een reservering aan de tafel is gekoppeld verandert deze functie de status van available naar booked
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
        if (reservation.getReservedTable() != this) {
            reservation.setReservedTable(this);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
