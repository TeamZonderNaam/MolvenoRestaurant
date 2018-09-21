package com.capgemini.view.employee.reservation;

import com.capgemini.model.Customer;
import com.capgemini.model.Reservation;
import com.capgemini.model.Table;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.List;
import java.util.Scanner;

public class ModifyReservationView extends View {
    private Scanner myScanner = new Scanner(System.in);
    private Reservation myReservation;

    public List<Reservation> getReservation() {
        return Window.myReservationService.get();
    }

    @Override
    public String stringDisplay() {
        modifyReservationView();
        String returnString = "";
        List<Reservation> myReservations = getReservation();
        returnString = getUpdatedDisplayString(returnString, myReservations);
        return returnString;
    }

    @Override
    public View handler(String action) {
        return null;
    }

    static String getUpdatedDisplayString(String returnString, List<Reservation> myReservation) {
        if (myReservation.isEmpty()) {
            returnString += "\nThere are no reservation(s).";
        } else {
            int count = 1;
            for (Reservation reservation : myReservation) {
                returnString += "\nReservation " + count + ": Name " + reservation.getCustomer().getName() + ": attending " + reservation.getNumberOfPersons();
                count++;
            }
        }
        return returnString;
    }

    public void modifyReservationView(){
        int reservationToModifyIndex;
        int numberPersons;
        String customerName;
        System.out.println("\nWhich reservation do you want to modify?");
        reservationToModifyIndex = Integer.parseInt(myScanner.next());
        reservationToModifyIndex--;

        System.out.println("\nHow many people are going to attend?");
        numberPersons = Integer.parseInt(myScanner.next());

        System.out.println("\nOn which name is the reservation under");
        customerName = myScanner.next();

        Reservation reservation = new Reservation();
        Customer customer = new Customer();

        Table reservedTable;
        reservedTable = AddReservationView.checkAvailability(numberPersons);

        customer.setName(customerName);
        reservation.setCustomer(customer);
        reservation.setNumberOfPersons(numberPersons);
        reservation.setReservedTable(reservedTable);
        Window.myReservationService.update(reservationToModifyIndex, reservation);
    }
}

