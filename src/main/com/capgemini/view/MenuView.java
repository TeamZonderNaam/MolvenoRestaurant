package com.capgemini.view;

import java.sql.SQLOutput;

public class MenuView extends View {
    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nMenu Page"
                        +"\n1 - Pizza"
                        +"\n2 - Lasagna";
        return returnString;
    }
    @Override
    public View handler(String action) {
        return null;
    }
}
