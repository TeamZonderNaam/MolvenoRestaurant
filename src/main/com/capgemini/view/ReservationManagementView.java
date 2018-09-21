package com.capgemini.view;

import com.capgemini.service.ReservationService;
import com.capgemini.service.TableService;

import java.util.ArrayList;
import java.util.List;

public class ReservationManagementView extends View{
    private List<View> reservationManagementViewNextList = new ArrayList<View>();
    private ReservationService myReservationService = new ReservationService();

    // Constructor
    public ReservationManagementView() {
        reservationManagementViewNextList.add(new DisplayReservationView());
        reservationManagementViewNextList.add(new AddReservationView());
        reservationManagementViewNextList.add(new ModifyReservationView());
        reservationManagementViewNextList.add(new DeleteReservationView());
    }
    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nReservation Management Page"
                        +"\nPlease choose from these options:"
                        +"\n1 - View reservation(s)"
                        +"\n2 - Add a reservation"
                        +"\n3 - Modify a reservation"
                        +"\n4 - Delete a reservation";
        return returnString;
    }

    @Override
    public View handler(String action) {
        View returnView;
        switch(action) {
            case "1":
                returnView = reservationManagementViewNextList.get(0);
                break;
            case "2":
                returnView = reservationManagementViewNextList.get(1);
                break;
            case "3":
                returnView = reservationManagementViewNextList.get(2);
                break;
            case "4":
                returnView = reservationManagementViewNextList.get(3);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
