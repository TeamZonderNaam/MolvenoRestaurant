package com.capgemini.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Portal extends View {

    @Override
    public void show(){
        System.out.println("1 - Guest");
        System.out.println("2 - Employee");
        System.out.println("3 - Exit");
        System.out.println("Your Selection: ");
    }

    public Portal(){
        System.out.println("Portal Created!");
        ArrayList<View> portalViewList = new ArrayList<View>();
        portalViewList.add(new Guest());
        portalViewList.add(new Employee());
    }



    /*
    private boolean portalHandler(String selection, Scanner scanner) {
        boolean done = false;
        switch (selection) {
            case "1":
                Guest guest = new Guest();
                guest.show(scanner);
                break;
            case "2":
                // Insert method to go to the employee view.
                break;
            case "3":
                done = true;
                break;
            default:
                System.out.println("Invalid choice: selection not known!");
        }
        return done;
    }
    */
}
