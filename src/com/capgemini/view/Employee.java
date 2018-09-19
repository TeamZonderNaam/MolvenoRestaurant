package com.capgemini.view;

import java.util.Scanner;

public class Employee extends View{

    @Override
    public void show() {
        System.out.println("1 - Guest");
        System.out.println("2 - Employee");
        System.out.println("3 - Exit");
        System.out.println("Your Selection: ");
    }
    public Employee(){
        System.out.println("Employee View Created!");
    }
}
