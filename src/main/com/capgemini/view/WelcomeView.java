package com.capgemini.view;

import com.capgemini.view.driver.View;

import java.util.ArrayList;
import java.util.List;

public class WelcomeView extends View {
    private List<View> welcomeViewNextList = new ArrayList<View>();

    // Constructor
    public WelcomeView() {
        welcomeViewNextList.add(new GuestView());
        welcomeViewNextList.add(new EmployeeView());
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nWelcome to the website of Molveno Lake Resort Restaurant."
                        +"\nPlease choose from these options:"
                        +"\n1 - Guest"
                        +"\n2 - Employee";
        return returnString;
    }
    @Override
    public View handler(String selection) {
        View returnView;
        switch (selection) {
            case "1":
                returnView = welcomeViewNextList.get(0);
                break;
            case "2":
                returnView = welcomeViewNextList.get(1);
                break;
            default:
                System.out.println("\nInvalid choice, please try again.");
                returnView = null;
        }
        return returnView;
    }
}
