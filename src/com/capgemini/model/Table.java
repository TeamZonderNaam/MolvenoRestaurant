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
}
