package com.capgemini.view;

import com.capgemini.model.Customer;
import com.capgemini.model.Reservation;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;
import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.List;
import java.util.Scanner;

public class ReservationView extends View {
    private Scanner scanner = new Scanner(System.in);
    private TableService tableService;

    public ReservationView(TableService tableService) {
        this.tableService = tableService;
    }

    private void makeReservation() {
        int numberOfPersons;
        Customer customer = new Customer();
        Reservation reservation = new Reservation();
        Table reservedTable;
        System.out.println("\n For how many persons would you like to reserve?");
        numberOfPersons = Integer.parseInt(scanner.next());
        reservedTable = checkAvailabilty(numberOfPersons);
        if (reservedTable==null) {
            System.out.println("\nNo tables available.");
        } else {
            System.out.println("\nWhat is your name?");
            customer.setName(scanner.next());
            reservation.setCustomer(customer);
            reservation.setNumberOfPersons(numberOfPersons);
            reservation.setReservedTable(reservedTable);
            Window.myReservationService.add(reservation);
        }
    }

    private Table checkAvailabilty(int numberPersons) {
        List<Table> tables = tableService.get();
        Table returnTable = null;
        for(Table table : tables) {
            if (table.getStatus()== TableStatus.AVAILABLE) {
                if (table.getNumberPersons() >= numberPersons) {
                    returnTable = table;
                    break;
                }
            }
        }
        return returnTable;
    }

    public String stringDisplay() {
        makeReservation();
        return "\nThank you for your reservation!";
    }

    public View handler(String action) {
        return null;
    }
}
