package com.capgemini.view;

import com.capgemini.view.driver.View;
import com.capgemini.view.menu.item.MenuItemView;
import com.capgemini.view.table.TableManagementView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeView extends View {
    private List<View> employeeViewNextList = new ArrayList<>();

    //Constructor
    public EmployeeView() {
        employeeViewNextList.add(new MenuItemView());
        employeeViewNextList.add(new TableManagementView());
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nEmployee Page"
                +"\nPlease choose from these options:"
                +"\n1 - Menu Management"
                +"\n2 - Order Management"
                +"\n3 - Reservation Management"
                +"\n4 - Table Management";
        return returnString;
    }
    @Override
    public View handler(String action) {
        View returnView;

        switch(action) {
            case "1":
                returnView = employeeViewNextList.get(0);
                break;
            case "4":
                returnView = employeeViewNextList.get(1);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
