package com.capgemini.Controller;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;

import java.util.ArrayList;

public class MenuController {

    public void addMenuItem(){
        MenuItemController menuItem = new MenuItemController();
        menuItem.addMoreItems();
    }

    public void checkMenuItems(){
        MenuItemService menuItemService = new MenuItemService();
        System.out.println(menuItemService.menuItemsList);
       // return menuItemService.menuItemsList;
    }
}
