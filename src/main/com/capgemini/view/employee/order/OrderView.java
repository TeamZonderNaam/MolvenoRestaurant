package com.capgemini.view.employee.order;

import com.capgemini.view.driver.View;
import com.capgemini.view.driver.Window;

import java.util.ArrayList;
import java.util.List;

public class OrderView extends View {
    private List<View> nextList = new ArrayList<>();

    // Constructor
    public OrderView() {
        nextList.add(new GetOrderView(Window.orderService));
        nextList.add(new AddOrderView(Window.orderService));
        nextList.add(new EditOrderView(Window.orderService));
        nextList.add(new DeleteOrderView(Window.orderService));
    }

    @Override
    public String stringDisplay() {
        String returnString = "";
        returnString +=
                "\nOrder Management Page"
                        +"\nPlease choose from these options:"
                        +"\n1 - View orders"
                        +"\n2 - Add an order"
                        +"\n3 - Modify an order"
                        +"\n4 - Delete an order";
        return returnString;
    }

    @Override
    public View handler(String action) {
        View returnView;
        switch(action) {
            case "1":
                returnView = nextList.get(0);
                break;
            case "2":
                returnView = nextList.get(1);
                break;
            case "3":
                returnView = nextList.get(2);
                break;
            case "4":
                returnView = nextList.get(3);
                break;
            default:
                returnView = null;
        }
        return returnView;
    }
}
