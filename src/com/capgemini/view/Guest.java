package com.capgemini.view;

import java.util.Scanner;

import java.sql.SQLOutput;

public class Guest extends View{

    public void show() {
        System.out.println("\nChoose one of the following options and press enter:");
        System.out.println("1 - Menu");
        System.out.println("2 - Reserve a table");
        System.out.println("3 - Login");
        System.out.println("4 - Register");
        System.out.println("5 - Back\n");
    }

    public Guest(){
        System.out.println("Guest View Created!");
    }
/*
    private boolean guestHandler(String mySelection, Scanner scanner) {
        boolean done = false;
        switch (mySelection) {
            case "1":
                // Insert method to display the menu.
                break;
            case "2":
                // Insert method to reserve a table.
                break;
            case "3":
                // Insert method to login.
                done = true;
                break;
            case "4":
                // Insert method to register.
                done = true;
                break;
            case "5":
                Portal portal = new Portal();
                portal.show(scanner);
                //Instert method to open Portal
                done = true;
                break;
            default:
                System.out.println("Invalid choice: selection not known!");
        }
        return done;
    }
    */
}
