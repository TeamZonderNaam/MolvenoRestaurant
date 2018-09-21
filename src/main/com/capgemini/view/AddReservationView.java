package com.capgemini.view;

import com.capgemini.model.Customer;
import com.capgemini.model.Reservation;
import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import com.capgemini.service.ReservationService;
import com.capgemini.service.TableService;

import java.util.List;
import java.util.Scanner;

public class AddReservationView extends View {

    private Scanner scanner = new Scanner(System.in);
    private Reservation myReservation;

    public void addReservation() {
        int numberPersons;
        Customer customer = new Customer();
        customer.setName("");
        Reservation reservation = new Reservation();
        System.out.println("\nHow many people are going to attend?");
        numberPersons = Integer.parseInt(scanner.next());

        System.out.println("\nWhat is the customer name?");
        customer.setName(scanner.next());

        Table reservedTable;
        reservedTable = checkAvailability(numberPersons);
        if(reservedTable==null){
            System.out.println("\nNo Tables available.");
        }else{
            reservation.setCustomer(customer);
            reservation.setNumberOfPersons(numberPersons);
            reservation.setReservedTable(reservedTable);
            Window.myReservationService.add(reservation);
        }
    }

    static Table checkAvailability(int numberPersons){
        List<Table> tables = Window.myTableService.get();
        Table returnTable = null;
        for(Table table : tables){
            if(table.getStatus()== TableStatus.AVAILABLE){
                if(table.getNumberPersons() >= numberPersons){
                    returnTable = table;
                    break;
                }
            }
        }
        return returnTable;
    }

    @Override
    public String stringDisplay() {
        addReservation();
        return "\nThe reservation has been added.";
    }

    @Override
    public View handler(String action) {
        return this;
    }
}
