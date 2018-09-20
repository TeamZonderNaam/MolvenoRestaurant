package com.capgemini.service;

import com.capgemini.model.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ReservationServiceTest {
    // Test Data
    private Reservation reservation1 = new Reservation();
    private Reservation reservation2 = new Reservation();
    private Reservation reservation3 = new Reservation();
    private Reservation reservation4 = new Reservation();

    // The service itself
    private ReservationService service;

    // BeforeEach instead of BeforeAll because we want our service to be empty when we start a unit test
    @BeforeEach
    public void init() {
        service = new ReservationService();
    }

    @Test
    public void get() {
        service.add(reservation1);
        service.add(reservation2);
        service.add(reservation3);
        service.add(reservation4);

        List<Reservation> reservations = service.get();
        assertEquals(4, reservations.size());

        assertSame(reservations.get(0), reservation1);
        assertSame(reservations.get(1), reservation2);
        assertSame(reservations.get(2), reservation3);
        assertSame(reservations.get(3), reservation4);
    }

    @Test
    public void getId() {
        service.add(reservation1);
        service.add(reservation2);
        service.add(reservation3);
        service.add(reservation4);

        assertSame(reservation1, service.get(0));
        assertSame(reservation2, service.get(1));
        assertSame(reservation3, service.get(2));
        assertSame(reservation4, service.get(3));

        assertNull(service.get(4));

        assertNull(service.get(-1));
    }

    @Test
    public void add() {
        boolean ok = service.add(reservation1);
        assertTrue(ok);
        assertEquals(1, service.get().size());

        ok = service.add(reservation2);
        assertTrue(ok);
        assertEquals(2, service.get().size());

        ok = service.add(reservation3);
        assertTrue(ok);
        assertEquals(3, service.get().size());

        ok = service.add(reservation4);
        assertTrue(ok);
        assertEquals(4, service.get().size());
    }

    @Test
    public void update() {
        service.add(reservation1);
        service.add(reservation2);
        service.add(reservation3);
        service.add(reservation4);

        Reservation reservation = new Reservation();
        service.update(0, reservation);
        assertSame(service.get(0), reservation);

        assertSame(service.update(4, reservation), null);

        assertSame(service.update(-1, reservation), null);
    }

    @Test
    public void delete() {
        service.add(reservation1);
        service.add(reservation2);
        service.add(reservation3);
        service.add(reservation4);

        service.delete(0);

        assertSame(service.get(0), reservation2);
        assertSame(service.get(1), reservation3);
        assertSame(service.get(2), reservation4);

        assertNull(service.get(3));

        assertNull(service.get(-1));
    }
}
