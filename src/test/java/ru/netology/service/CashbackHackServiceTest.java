package ru.netology.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldIfAmountUnderLimitBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountLessLimitBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}