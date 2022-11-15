package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class CashbackHackServiceTest {


    @Test
    public void shouldIfAmountUnderLimitBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountLessLimitBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;


        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}