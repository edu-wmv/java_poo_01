package com.edu.tomorrow.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private Bank bank;

    @BeforeEach
    public void setup() {
        this.bank = new Bank("John", "Mary", "Peter");
    }

    @Test
    public void testCredit() {
        bank.credit("John", 1000);
        assertEquals(1000, bank.getBalance("John"));
    }

    @Test
    public void testDebit() {
        bank.debit("Mary", 2000);
        assertEquals(-2000, bank.getBalance("Mary"));
    }

    @Test
    public void testTransfer() {
        bank.credit("John", 1000);
        bank.transfer("John", "Mary", 500);
        assertEquals(500, bank.getBalance("John"));
        assertEquals(500, bank.getBalance("Mary"));
    }
}
