package com.capgemini.model;

import java.time.LocalDateTime;

public class Reservation {
    //een reservering heeft klantgegevens, aantal personen, een tafelnummer, kinderzitjes nodig, parkeerplaats nodig en een tijd (begintijd en tijdsduur)

    private String custName;
    private String custPhoneNumber;
    private String custEmailAddress;
    private boolean parkingSpaceNeeded;
    private int numberOfChildSeats;
    private int numberOfPersons;
    private Table reservedTable;
    private LocalDateTime startReservation;
    private int totalTimeInMinutes;

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhoneNumber() {
        return custPhoneNumber;
    }

    public void setCustPhoneNumber(String custPhoneNumber) {
        this.custPhoneNumber = custPhoneNumber;
    }

    public String getCustEmailAddress() {
        return custEmailAddress;
    }

    public void setCustEmailAddress(String custEmailAddress) {
        this.custEmailAddress = custEmailAddress;
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
