package com.capgemini.view;

import java.util.ArrayList;
import java.util.List;

public class GuestView extends View {
    List<View> guestViewNextList = new ArrayList<View>();

    // Constructor
    public GuestView() {
        guestViewNextList.add(new MenuView());
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
                        +"\n4 - Reserve a table"
                        +"\n5 - Previous page";
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
                returnView = null;
                break;
            case "5":
                returnView = null;
                break;
            default:
                System.out.println("\nInvalid choice, please try again.");
                returnView = null;
        }
        return returnView;
    }
}
