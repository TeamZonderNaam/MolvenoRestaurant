package com.capgemini.view;

import com.capgemini.model.Reservation;
import java.util.List;
import java.util.Scanner;

public class ModifyReservationView extends View{
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
                returnString += "\nReservation " + count + ": people " + reservation.getNumberOfPersons();

                count++;
            }
        }
        return returnString;
    }

    public void modifyReservationView(){
        int reservationToModifyIndex;
        int numberPersons;
        System.out.println("\nWhich table do you want to modify?");
    }
}

