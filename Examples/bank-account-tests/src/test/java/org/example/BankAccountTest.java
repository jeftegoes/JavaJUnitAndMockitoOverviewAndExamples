package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    private BankAccount bankAccount;
    private static int count;

    @BeforeAll
    public static void beforeAllOrClass() {
        System.out.println("This executes before any test cases. Count =  " + count++);
    }

    @BeforeEach
    public void setup() {
        this.bankAccount = new BankAccount("Jefté", "Goes", 1000, BankAccount.CHECKING);
        System.out.println("Running a test...");
    }

    @Test
    public void deposit() {
        double balance = bankAccount.deposit(200, true);
        assertEquals(1200, balance, 0);
    }

    @Test
    public void withdraw() {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test
    public void withdraw_notBranch() {
        assertThrows(IllegalArgumentException.class, () -> {
            double balance = bankAccount.withdraw(600.00, false);
        });
    }

    @Test
    public void getBalance_deposit() {
        bankAccount.deposit(200, true);
        assertEquals(1200, bankAccount.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
        bankAccount.withdraw(200, true);
        assertEquals(800, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() {
        assertTrue(bankAccount.isChecking(), "The account is NOT a checking account!");
    }

    @AfterAll
    public static void afterAllOrClass() {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @AfterEach
    public void teardown() {
        System.out.println("Count = " + count++);
    }
}
