package com.capgemini.model;

public class Table {

    private int numberPersons;
    private TableStatus status;

    public Table(TableStatus status, int numberPersons) {
        this.status = status;
        this.numberPersons = numberPersons;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void reserveTable () {
        if (this.status == TableStatus.AVAILABLE) {
            this.status = TableStatus.BOOKED;
        }
        else {
            System.out.println("This table is not available");
        }
    }

    public int getNumberPersons() {
        return numberPersons;
    }

//    public void setNumberPersons(int numberPersons) {
//        this.numberPersons = numberPersons;
//    }
}
