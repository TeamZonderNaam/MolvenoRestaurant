package com.capgemini.service;

import com.capgemini.model.Table;
import com.capgemini.model.TableStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TableServiceTest {
    // Test Data
    private Table table1 = new Table(TableStatus.AVAILABLE, 2);
    private Table table2 = new Table(TableStatus.BOOKED, 1);
    private Table table3 = new Table(TableStatus.BLOCKED, 4);
    private Table table4 = new Table(TableStatus.BLOCKED, 0);

    // The service itself
    private TableService service;

    // BeforeEach instead of BeforeAll because we want our service to be empty when we start a unit test
    @BeforeEach
    public void init() {
        service = new TableService();
    }

    @Test
    public void get() {
        service.add(table1);
        service.add(table2);
        service.add(table3);
        service.add(table4);

        List<Table> tables = service.get();
        assertEquals(4, tables.size());

        assertSame(tables.get(0), table1);
        assertSame(tables.get(1), table2);
        assertSame(tables.get(2), table3);
        assertSame(tables.get(3), table4);
    }

    @Test
    public void getId() {
        service.add(table1);
        service.add(table2);
        service.add(table3);
        service.add(table4);

        assertSame(service.get(0), table1);
        assertSame(service.get(1), table2);
        assertSame(service.get(2), table3);
        assertSame(service.get(3), table4);

        assertNull(service.get(4));

        assertNull(service.get(-1));
    }

    @Test
    public void add() {
        boolean ok = service.add(table1);
        assertTrue(ok);
        assertEquals(1, service.get().size());

        ok = service.add(table2);
        assertTrue(ok);
        assertEquals(2, service.get().size());

        ok = service.add(table3);
        assertTrue(ok);
        assertEquals(3, service.get().size());

        ok = service.add(table4);
        assertTrue(ok);
        assertEquals(4, service.get().size());
    }

    @Test
    public void update() {
        service.add(table1);
        service.add(table2);
        service.add(table3);
        service.add(table4);

        Table table = new Table(TableStatus.AVAILABLE, 100);
        service.update(0, table);
        assertSame(service.get(0), table);

        assertSame(service.update(4, table), null);

        assertSame(service.update(-1, table), null);
    }

    @Test
    public void delete() {
        service.add(table1);
        service.add(table2);
        service.add(table3);
        service.add(table4);

        service.delete(0);

        assertSame(service.get(0), table2);
        assertSame(service.get(1), table3);
        assertSame(service.get(2), table4);

        assertNull(service.get(3));

        assertNull(service.get(-1));
    }
}
