package com.capgemini.service;

import com.capgemini.model.MenuItem;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuItemService implements Service<MenuItem> {
    ArrayList<MenuItem> menuItemsList = new ArrayList<>();
    public static void main(String[] args) {

    }
    @Override
    public boolean add(MenuItem item) {
        return false;
    }

    public String addMenu(){
        System.out.println("enter your menu item:");
        Scanner scanner = new Scanner(System.in);
        String inputOfMenu = scanner.nextLine();

        System.out.println("enter the price of the " + inputOfMenu + ":");
        double inputPriceOfMenuItem = scanner.nextDouble();

        System.out.println("enter the number of the " + inputOfMenu + ":");
        int inputNumberOfMenuItem = scanner.nextInt();

        System.out.println("Menu item is added. Add more items?(yes or no)");
        String inputMoreItems = scanner.next();

        menuItemsList.add(new MenuItem(inputOfMenu, inputPriceOfMenuItem, inputNumberOfMenuItem));
        System.out.println("Menu list:");
        for(MenuItem i: menuItemsList){
            System.out.println(i.getNumber() + "." + i.getName() + "---------------  €" + i.getPrice());
        }
        return inputMoreItems;
    }

    public void addMoreItems(){
            do{
                this.addMenu();
            }while(
                this.addMenu() == "yes"
            );
    }
}
