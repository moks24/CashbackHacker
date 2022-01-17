package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void should() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1600;

        int actual = cashbackHackService.remain(amount);
        int expected = 400;

        assertEquals(expected, actual);
    }

}
