package com.capgemini.view;

import com.capgemini.model.Reservation;
import com.capgemini.model.Table;

import java.util.List;
import java.util.Scanner;

public class DeleteReservationView extends View{
    private Scanner myScanner = new Scanner(System.in);
    private Reservation reservation;


    public List<Reservation> getReservations() {
        return Window.myReservationService.get();
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        List<Reservation> reservations = getReservations();
        modifyReservationView();
        returnString = ModifyReservationView.getUpdatedDisplayString(returnString, reservations);
        return returnString;
    }
    @Override
    public View handler(String action) {
        return null;
    }

    public void modifyReservationView(){
        int reservationToModifyIndex;
        System.out.println("\nWhich reservation do you want to delete?");
        reservationToModifyIndex = Integer.parseInt(myScanner.next());
        reservationToModifyIndex--;
        Window.myReservationService.delete(reservationToModifyIndex);
    }
}
