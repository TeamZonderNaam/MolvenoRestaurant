package com.capgemini.model;

import java.time.LocalDateTime;

public class Reservation {
    //een reservering heeft klantgegevens, aantal personen, een tafelnummer, kinderzitjes nodig, parkeerplaats nodig en een tijd (begintijd en tijdsduur)

    private Customer customer;
    private boolean parkingSpaceNeeded;
    private int numberOfChildSeats;
    private int numberOfPersons;
    //dit zou eigenlijk een list moeten worden
    private Table reservedTable;
    private LocalDateTime startReservation;
    private int totalTimeInMinutes;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public boolean isParkingSpaceNeeded() {
        return parkingSpaceNeeded;
    }

    public void setParkingSpaceNeeded(boolean parkingSpaceNeeded) {
        this.parkingSpaceNeeded = parkingSpaceNeeded;
    }

    public int getNumberOfChildSeats() {
        return numberOfChildSeats;
    }

    public void setNumberOfChildSeats(int numberOfChildSeats) {
        this.numberOfChildSeats = numberOfChildSeats;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public Table getReservedTable() {
        return reservedTable;
    }

    public void setReservedTable(Table reservedTable) {
        this.reservedTable = reservedTable;
        reservedTable.setReservation(this);
    }

    public LocalDateTime getStartReservation() {
        return startReservation;
    }

    public void setStartReservation(LocalDateTime startReservation) {
        this.startReservation = startReservation;
    }

    public int getTotalTimeInMinutes() {
        return totalTimeInMinutes;
    }

    public void setTotalTimeInMinutes(int totalTimeInMinutes) {
        this.totalTimeInMinutes = totalTimeInMinutes;
    }
}
