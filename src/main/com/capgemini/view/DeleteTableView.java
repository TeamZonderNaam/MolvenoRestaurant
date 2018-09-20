package com.capgemini.view;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

import java.util.List;
import java.util.Scanner;

public class DeleteTableView extends View {
    private TableService tableService = new TableService();
    private Scanner myScanner = new Scanner(System.in);
    private Table myTable;

    public DeleteTableView(TableService tableService) {
        this.tableService = tableService;
    }

    public List<Table> getTables() {
        return tableService.get();
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        List<Table> myTables = getTables();
        modifyTableView();
        returnString = ModifyTableView.getUpdatedDisplayString(returnString, myTables);
        return returnString;
    }
    @Override
    public View handler(String action) {
        return null;
    }

    public void modifyTableView(){
        int tableToModifyIndex;
        System.out.println("\nWhich table do you want to delete?");
        tableToModifyIndex = Integer.parseInt(myScanner.next());
        tableToModifyIndex--;
        tableService.delete(tableToModifyIndex);
    }
}
