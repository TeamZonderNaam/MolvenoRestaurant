package com.capgemini.view.table;

import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;
import com.capgemini.view.table.AddTableView;
import com.capgemini.view.table.DisplayTableView;

import java.util.ArrayList;
import java.util.List;

public class TableManagementView extends View {
    private List<View> tableManagementViewNextList = new ArrayList<View>();

    // Constructor
    public TableManagementView() {
        tableManagementViewNextList.add(new DisplayTableView(Window.myTableService));
        tableManagementViewNextList.add(new AddTableView(Window.myTableService));
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
            default:
                returnView = null;
        }
        return returnView;
    }
}
