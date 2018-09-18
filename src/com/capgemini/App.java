package com.capgemini;

import com.capgemini.service.MenuItemService;

public class App {
    public static void main(String[] args) {
        MenuItemService menuItemService = new MenuItemService();
        menuItemService.addMenu();
        menuItemService.addMoreItems();
    }
}
