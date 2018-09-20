package com.capgemini.view;

import java.util.Scanner;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

public class AddTableView extends View {
    private Scanner scanner = new Scanner(System.in);
    private Table myTable;

    public void addTable() {
        int numberPersons;
        System.out.println("\nFor how many persons is the table?");
        numberPersons = Integer.parseInt(scanner.next());
        myTable = new Table(TableStatus.AVAILABLE, numberPersons);
        Window.myTableService.add(myTable);
    }

    @Override
    public String stringDisplay() {
        addTable();
        return "\nThe table has been added.";
    }

    @Override
    public View handler(String action) {
        return this;
    }
}
