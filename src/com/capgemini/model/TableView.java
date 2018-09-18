package com.capgemini.model;

public class TableView {

    public static void main(String[] args) {
        //lijst van de tafels uit TableList class printen
        TableList tableList1 = new TableList();
        tableList1.makeTableList();

        //een klant en gekoppelde reservering aanmaken en de naam van de gast printen
        Customer customer1 = new Customer();
        Reservation reservation1 = new Reservation();
        customer1.setName("Mary Jane");

        reservation1.setCustomer(customer1);
        reservation1.setNumberOfPersons(5);
        reservation1.setReservedTable(tableList1.makeTableList()[0]);
        System.out.println(reservation1.getCustomer().getName() + " has reserved for " + reservation1.getNumberOfPersons() + " people. She" +
                "reserved a table which has room for " + reservation1.getReservedTable().getNumberPersons() + " people.");
    }
}
