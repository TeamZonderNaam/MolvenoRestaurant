package com.capgemini.view;

import com.capgemini.model.Reservation;
import java.util.List;

public class DisplayReservationView extends View{
    public List<Reservation> getReservation() {
        return Window.myReservationService.get();
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        List<Reservation> myReservations = getReservation();
        returnString = ModifyReservationView.getUpdatedDisplayString(returnString, myReservations);
        return returnString;
    }

    @Override
    public View handler(String action) {
        return null;
    }
}
