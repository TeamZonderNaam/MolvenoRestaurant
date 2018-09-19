package com.capgemini.view;

import java.util.Scanner;
import java.util.Stack;

public class Window {

    public void start() {
        View currentView = new WelcomeView();
        View nextView = null;
        Stack<View> previousPages = new Stack<>();
        Scanner myScanner = new Scanner(System.in);
        String selection;
        String viewDisplay = "";
        boolean finished = false;
        do {
            viewDisplay = currentView.stringDisplay();
            if (!previousPages.isEmpty()) {
                viewDisplay += "\nB - Back";
            }
            viewDisplay +=
                    "\nE - Exit"
                    +"\nOption:";

            System.out.println(viewDisplay);
            selection = myScanner.next();

            if (!previousPages.isEmpty()&&(selection.toLowerCase().equals("b"))) {
                currentView = previousPages.pop();
                continue;
            } else if (selection.toLowerCase().equals("e"))  {
                finished = true;
                break;
            } else {
                nextView = currentView.handler(selection);
            }

            if (nextView!=null) {
                previousPages.push(currentView);
                currentView = nextView;
            }
        } while (!finished);
    }
}
