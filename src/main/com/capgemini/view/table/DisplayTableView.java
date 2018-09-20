package com.capgemini.view.table;

import com.capgemini.model.Table;
import com.capgemini.service.TableService;
import com.capgemini.view.driver.View;

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
        if (myTables.isEmpty()) {
            returnString += "\nThere are no tables.";
        } else {
            int count = 1;
            for (Table table : myTables) {
                returnString += "\nTable " + count + " - seats: " + table.getNumberPersons() + " - status: " + table.getStatus();

                count++;
            }
        }
        return returnString;
    }


    @Override
    public View handler(String action) {
        return null;
    }
}
