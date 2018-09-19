package com.capgemini.model;

public class TableList {

    private Table[] tableList;

    public Table[] makeTableList() {
        Table[] tableList = new Table[10];
        Table table = new Table(4);
        tableList[0] = new Table( 4);
        tableList[1] = new Table(4);
        tableList[2] = new Table(4);
        tableList[3] = new Table(4);
        tableList[4] = new Table(12);
        tableList[5] = new Table(12);
        tableList[6] = new Table(12);
        tableList[7] = new Table(12);
        tableList[8] = new Table(1);
        tableList[9] = new Table(1);
        return tableList;
    }

//    public Table[] getTables() {
//        return tableList;
//    }

    public static void printTableList(Table[] list) {
        int tableNumber = 1;
        //hier kreeg ik eerst een nullpointer-exception
        for (Table i : list) {
            System.out.println("Table " + tableNumber + " has room for " + i.getNumberPersons() + " persons, and is currently " + i.getStatus());
            tableNumber++;
        }
    }

}
