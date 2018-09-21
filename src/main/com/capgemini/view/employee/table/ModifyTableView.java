package com.capgemini.view.employee.table;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;
import java.util.List;
import java.util.Scanner;

public class ModifyTableView extends View {
    private Scanner myScanner = new Scanner(System.in);
    private Table myTable;


    public List<Table> getTables() {
        return Window.myTableService.get();
    }

    @Override
    public String stringDisplay() {
        modifyTableView();
        String returnString = "";
        List<Table> myTables = getTables();
        returnString = getUpdatedDisplayString(returnString, myTables);
        return returnString;
    }

    @Override
    public View handler(String action) {
        return null;
    }

    static String getUpdatedDisplayString(String returnString, List<Table> myTables) {
        if (myTables.isEmpty()) {
            returnString += "\nThere are no tables.";
        } else {
            int count = 1;
            for (Table table : myTables) {
                returnString += "\nTable " + count + ": seats " + table.getNumberPersons();

                count++;
            }
        }
        return returnString;
    }

    public void modifyTableView(){
        int tableToModifyIndex;
        int numberPersons;
        System.out.println("\nWhich table do you want to modify?");
        tableToModifyIndex = Integer.parseInt(myScanner.next());
        tableToModifyIndex--;

        System.out.println("\nFor how many persons is the table?");
        numberPersons = Integer.parseInt(myScanner.next());

        myTable = new Table(TableStatus.AVAILABLE, numberPersons);
        Window.myTableService.update(tableToModifyIndex, myTable);
    }
}
