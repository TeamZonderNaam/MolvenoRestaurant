package com.capgemini.view;

import java.util.ArrayList;
import java.util.Scanner;

public class Window {
    private ArrayList<View> windowViewList = new ArrayList<View>();

    public void running(){
        windowViewList.add(new Portal());
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = false;
        do {
            for (View view: windowViewList) {
                view.show();
                //View viewPointer = view.Handler(scanner);
            }
           isRunning = true;
        }while(!isRunning);
    }
}
