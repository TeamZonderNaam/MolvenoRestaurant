package com.capgemini.view;

import com.capgemini.model.Reservation;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.TableService;

import java.util.List;
import java.util.Scanner;

public class ReservationView extends View {
    private Scanner scanner = new Scanner(System.in);
    private TableService tableService;

    public ReservationView(TableService tableService) {
        this.tableService = tableService;
    }

    private Reservation makeReservation() {
        System.out.println("\n For how many persons would you like to reserve?");
        if (!checkAvailabilty(Integer.parseInt(scanner.next()))) {
            System.out.println("\nNo tables available");
        } else {
            System.out.println("\nThank you for your reservation");
        }
        return null;
    }

    private boolean checkAvailabilty(int numberPersons) {
        List<Table> tables = tableService.get();
        boolean isAvailable = false;
        for(Table table : tables) {
            if (table.getStatus()== TableStatus.AVAILABLE) {
                if (table.getNumberPersons() >= numberPersons) {
                    isAvailable = true;
                    break;
                }
            }
        }
        return isAvailable;
    }

    public String stringDisplay() {
        makeReservation();
        return "";
    }

    public View handler(String action) {
        return null;
    }
}
