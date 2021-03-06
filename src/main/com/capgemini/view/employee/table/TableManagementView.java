package com.capgemini.view.employee.table;

import com.capgemini.view.driver.View;

import java.util.ArrayList;
import java.util.List;

public class TableManagementView extends View {
    private List<View> tableManagementViewNextList = new ArrayList<View>();

    // Constructor
    public TableManagementView() {
        tableManagementViewNextList.add(new DisplayTableView());
        tableManagementViewNextList.add(new AddTableView());
        tableManagementViewNextList.add(new ModifyTableView());
        tableManagementViewNextList.add(new DeleteTableView());
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nTable Management Page"
                +"\nPlease choose from these options:"
                +"\n1 - View tables"
                +"\n2 - Add a table"
                +"\n3 - Modify a table"
                +"\n4 - Delete a table";
        return returnString;
    }

    @Override
    public View handler(String action) {
        View returnView;
        switch(action) {
            case "1":
                returnView = tableManagementViewNextList.get(0);
                break;
            case "2":
                returnView = tableManagementViewNextList.get(1);
                break;
            case "3":
                returnView = tableManagementViewNextList.get(2);
                break;
            case "4":
                returnView = tableManagementViewNextList.get(3);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
