package com.capgemini;

import com.capgemini.view.Portal;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Portal portal = new Portal();
        portal.show(scanner);
    }
}
