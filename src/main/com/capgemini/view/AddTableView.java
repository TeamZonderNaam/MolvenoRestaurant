package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

public class AddTableView extends View {
    private Scanner myScanner = new Scanner(System.in);
    private Table myTable;
    private TableService tableService;

    public AddTableView(TableService tableService) {
        this.tableService = tableService;
    }


    public void addTable() {
        int numberPersons;
        System.out.println("\nFor how many persons is the table?");
        numberPersons = Integer.parseInt(myScanner.next());
        myTable = new Table(TableStatus.AVAILABLE, numberPersons);
        tableService.add(myTable);
    }

    @Override
    public String stringDisplay() {
        addTable();
        return "\nThe table has been added.";
    }

    @Override
    public View handler(String action) {
        return null;
    }
}
