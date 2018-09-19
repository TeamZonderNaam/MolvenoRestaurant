package com.capgemini.Controller;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;

import java.util.Scanner;

public class MenuItemController {
    private String inputOfItemName;
    private double inputPriceOfMenuItem;
    private int inputNumberOfMenuItem;
    private String inputMoreItems;
    MenuItemService menuItemService = new MenuItemService();

    public MenuItemController(){

    }

    public String addMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your menu item:");
        this.inputOfItemName = scanner.nextLine();

        System.out.println("enter the price of the " + inputOfItemName + ":");
        this.inputPriceOfMenuItem = scanner.nextDouble();

        System.out.println("enter the number of the " + inputOfItemName + ":");
        this.inputNumberOfMenuItem = scanner.nextInt();

        System.out.println("Menu item is added. Add more items?(yes or no)");
        this.inputMoreItems = scanner.next();

        System.out.println("Menu list:");
        this.menuItemService.add(new MenuItem(this.inputOfItemName, this.inputPriceOfMenuItem,this.inputNumberOfMenuItem));
        for(MenuItem i: menuItemService.menuItemsList){
            System.out.println(i.getNumber() + "." + i.getName() + "-------------€" + i.getPrice());
        }

        return inputMoreItems;
    }

    public void addMoreItems(){
        while(this.addMenu().equals("yes")){
            this.addMenu();
        }
    }

}
