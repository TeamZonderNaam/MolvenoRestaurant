package com.capgemini.model;

public class TableView {

    public static void main(String[] args) {
        //lijst van de tafels uit TableList class printen
        TableList tableList1 = new TableList();
        Table[] tables = tableList1.makeTableList();
        TableList.printTableList(tables);

        //een klant en gekoppelde reservering aanmaken en de naam van de gast printen
        Customer customer1 = new Customer();
        Reservation reservation1 = new Reservation();
        customer1.setName("Mary Jane");

        reservation1.setCustomer(customer1);
        reservation1.setNumberOfPersons(5);
        reservation1.setReservedTable(tables[0]);
        //nu moet de onderstaande nog automatisch gaan
        tables[0].setReservation(reservation1);
        //en het zou ook handig zijn als er een tafelnaam zou zijn, bv "Table 1"
        System.out.println("\n" + reservation1.getCustomer().getName() + " has reserved for " + reservation1.getNumberOfPersons() + " people. She " +
                "reserved a table which has room for " + reservation1.getReservedTable().getNumberPersons() + " people.\n");

        TableList.printTableList(tables);


    }
}
