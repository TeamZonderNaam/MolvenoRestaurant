package com.capgemini.view.guest;

import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;
import com.capgemini.view.employee.item.GetMenuItemView;
import com.capgemini.view.guest.menu.MenuView;
import com.capgemini.view.guest.reservation.ReservationView;


import java.util.ArrayList;
import java.util.List;

public class GuestView extends View {
    private List<View> guestViewNextList = new ArrayList<View>();

    // Constructor
    public GuestView() {
        guestViewNextList.add(new MenuView(Window.menuItemService));
        guestViewNextList.add(new ReservationView(Window.myTableService));
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nGuest Page"
                        +"\nPlease choose from these options:"
                        +"\n1 - Menu"
                        +"\n2 - Register"
                        +"\n3 - Login"
                        +"\n4 - Reserve a table";
        return returnString;
    }
    @Override
    public View handler(String action) {
        View returnView;
        switch (action) {
            case "1":
                returnView = guestViewNextList.get(0);
                break;
            case "2":
                returnView = null;
                break;
            case "3":
                returnView = null;
                break;
            case "4":
                returnView = guestViewNextList.get(1);
                break;
            default:
                System.out.println("\nInvalid choice, please try again.");
                returnView = null;
        }
        return returnView;
    }
}
