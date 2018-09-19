package com.capgemini;

import com.capgemini.Controller.MenuController;
import com.capgemini.Controller.MenuItemController;

public class App {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        //menuController.addMenuItem();
        menuController.checkMenuItems();
    }
}
