package com.capgemini.view;

import java.util.ArrayList;
import java.util.List;

public class EmployeeView extends View {
    List<View> employeeViewNextList = new ArrayList<>();
    //employeeViewNextList.add(new ReservationView);

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nEmployee Page"
                +"\nPlease choose from these options:"
                +"\n1 - Menu Management"
                +"\n2 - Order Management"
                +"\n3 - Reservation Management"
                +"\n4 - Table Management";
        return returnString;
    }
    @Override
    public View handler(String action) {
        return null;
    }
}
