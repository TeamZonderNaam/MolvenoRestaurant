package com.capgemini.view;

import com.capgemini.model.MenuItem;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;
import com.capgemini.view.menu.item.MenuItemView;
import com.capgemini.view.order.OrderView;
import com.capgemini.view.table.TableManagementView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeView extends View {
    private List<View> employeeViewNextList = new ArrayList<>();

    //Constructor
    public EmployeeView() {

        employeeViewNextList.add(new ReservationManagementView());
        // Mock some items
        Window.menuItemService.add(new MenuItem("Lorem", 2.0, 1));
        Window.menuItemService.add(new MenuItem("Ipsum", 5.0, 2));
        Window.menuItemService.add(new MenuItem("Doler", 1.0, 3));
        Window.menuItemService.add(new MenuItem("Sit", 8.0, 4));
        Window.menuItemService.add(new MenuItem("Amet", 1.0, 5));

        Window.myTableService.add(new Table(1, TableStatus.AVAILABLE, 4));
        Window.myTableService.add(new Table(2, TableStatus.AVAILABLE, 8));
        Window.myTableService.add(new Table(3, TableStatus.AVAILABLE, 6));
        Window.myTableService.add(new Table(4, TableStatus.AVAILABLE, 4));

        employeeViewNextList.add(new MenuItemView());
        employeeViewNextList.add(new OrderView());
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
            case "2":
                returnView = employeeViewNextList.get(1);
                break;
            case "3":
                returnView = employeeViewNextList.get(2);
                break;
            case "4":
                returnView = employeeViewNextList.get(3);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
