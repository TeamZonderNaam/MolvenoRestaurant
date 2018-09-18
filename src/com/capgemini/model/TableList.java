package com.capgemini.model;

public class TableList {

    public Table[]  makeTableList() {
        int tableNumber = 1;
        Table[] tableList = new Table[10];
        tableList[0] = new Table(TableStatus.AVAILABLE, 4);
        tableList[1] = new Table(TableStatus.AVAILABLE, 4);
        tableList[2] = new Table(TableStatus.AVAILABLE, 4);
        tableList[3] = new Table(TableStatus.AVAILABLE, 4);
        tableList[4] = new Table(TableStatus.AVAILABLE, 12);
        tableList[5] = new Table(TableStatus.AVAILABLE, 12);
        tableList[6] = new Table(TableStatus.AVAILABLE, 12);
        tableList[7] = new Table(TableStatus.AVAILABLE, 12);
        tableList[8] = new Table(TableStatus.AVAILABLE, 1);
        tableList[9] = new Table(TableStatus.AVAILABLE, 1);
        for (Table i : tableList) {
            System.out.println("Table " + tableNumber + " has room for " + i.getNumberPersons() + " persons, and is currently " + i.getStatus());
            tableNumber++;
        }
        return tableList;
    }

}
