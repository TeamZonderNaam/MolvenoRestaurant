package com.capgemini;

import com.capgemini.model.MenuItem;
import com.capgemini.service.MenuItemService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class TestTest {
    private MenuItem menuItem = new MenuItem("pizza", 10,1);
    private MenuItem menuItem2 = new MenuItem("pasts", 20,2);
    private MenuItem menuItem3 = new MenuItem("fish", 30,3);
    private MenuItem menuItem4 = new MenuItem("meat", 40,4);

    private MenuItemService menuItemService;

    @BeforeEach
    public void init(){
        menuItemService = new MenuItemService();
    }

    @Test
    public void getMenuItem() {
        menuItemService.add(menuItem);
        menuItemService.add(menuItem2);
        menuItemService.add(menuItem3);
        menuItemService.add(menuItem4);

        List<MenuItem> menuItems = menuItemService.get();
        assertEquals(4, menuItems.size());
    }

    @Test
    public void add(){
        boolean added = menuItemService.add(menuItem);
        assertTrue(added);
        assertEquals(1, menuItemService.get().size());
    }
}
