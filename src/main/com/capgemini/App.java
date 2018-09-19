package com.capgemini;

import com.capgemini.Controller.MenuController;
import com.capgemini.Controller.MenuItemController;
import com.capgemini.service.MenuItemService;

public class App {
    public static void main(String[] args) {

        MenuItemService menuItemService = new MenuItemService();
        MenuController menuController = new MenuController(menuItemService);

        menuController.choiceOfMenu();
    }
}
