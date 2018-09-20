package com.capgemini.view.driver;

public abstract class View {
    public abstract String stringDisplay();

    public abstract View handler(String action);
}