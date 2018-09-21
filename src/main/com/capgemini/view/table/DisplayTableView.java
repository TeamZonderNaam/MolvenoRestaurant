package com.capgemini.view.table;

import com.capgemini.model.Table;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.List;

public class DisplayTableView extends View {

    public List<Table> getTables() {
        return Window.myTableService.get();
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        List<Table> myTables = getTables();
        returnString = ModifyTableView.getUpdatedDisplayString(returnString, myTables);
        return returnString;
    }


    @Override
    public View handler(String action) {
        return null;
    }
}
