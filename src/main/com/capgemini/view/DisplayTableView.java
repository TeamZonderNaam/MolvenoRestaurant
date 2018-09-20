package com.capgemini.view;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

import java.util.List;

public class DisplayTableView extends View {
    private TableService tableService = new TableService();

    public DisplayTableView(TableService tableService) {
        this.tableService = tableService;
    }

    public List<Table> getTables() {
        return tableService.get();
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
