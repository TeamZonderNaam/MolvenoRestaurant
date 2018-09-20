package com.capgemini.view.menu.item;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;
import com.capgemini.view.table.AddTableView;
import com.capgemini.view.table.DisplayTableView;

public class MenuItemView extends View {
    private List<View> nextList = new ArrayList<>();

    // Constructor
    public MenuItemView() {
        nextList.add(new GetMenuItemView(Window.menuItemService));
        nextList.add(new AddMenuItemView(Window.menuItemService));
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nTable Management Page"
                        +"\nPlease choose from these options:"
                        +"\n1 - View menu items"
                        +"\n2 - Add a menu item"
                        +"\n3 - Modify a menu item"
                        +"\n4 - Delete a menu item";
        return returnString;
    }

    @Override
    public View handler(String action) {
        View returnView;
        switch(action) {
            case "1":
                returnView = nextList.get(0);
                break;
            case "2":
                returnView = nextList.get(1);
                break;
            case "3":
                returnView = nextList.get(0);
                break;
            case "4":
                returnView = nextList.get(0);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
