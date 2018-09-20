package com.capgemini.view;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

import java.util.List;
import java.util.Scanner;

public class DeleteTableView extends View {
    private Scanner myScanner = new Scanner(System.in);
    private Table myTable;


    public List<Table> getTables() {
        return Window.myTableService.get();
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
        Window.myTableService.delete(tableToModifyIndex);
    }
}
