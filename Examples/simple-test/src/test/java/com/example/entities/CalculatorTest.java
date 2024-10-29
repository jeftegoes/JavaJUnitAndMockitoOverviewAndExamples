package com.example.entities;

import org.junit.jupiter.api.*;

@DisplayName("Test Math operations in Calculator class")
public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public static void setUp() {
        System.out.println("Executing @BeforeAll method.");
    }

    @BeforeEach
    public void beforeEachTestMethod() {
        System.out.println("Executing @BeforeEach method.");
        calculator = new Calculator();
    }

    @AfterEach
    public void afterEachTestMethod() {
        System.out.println("Executing @AfterEach method.");
    }

    @DisplayName("Test 22 + 33 = 55")
    @Test
    public void calculatorMustSumTwoValues() {
        System.out.println("Test 22 + 33 = 55");
        // Arrange
        float valueA = 22f;
        float valueB = 33f;
        float expected = 55f;

        // Act
        float result = calculator.sumTwoValues(valueA, valueB);

        // Assert
        Assertions.assertEquals(expected, result, "The sum of " + valueA + " and " + valueB + " did not produce " + expected + ".");
    }

    @DisplayName("Test 4 / 2 = 2")
    @Test
    public void calculatorMustDivideTwoValues() {
        System.out.println("Test 4 / 2 = 2");
        // Arrange
        int valueA = 4;
        int valueB = 2;
        int expected = 2;

        // Act
        float result = calculator.divideTwoValues(valueA, valueB);

        // Assert
        Assertions.assertEquals(expected, result, "The division of " + valueA + " and " + valueB + " did not produce " + expected + ".");
    }

    @DisplayName("Division by zero")
    @Test
    public void calculatorMustThrowExceptionDivideByZero() {
        System.out.println("Test 4 / 0 = ERROR");
        // Arrange
        int valueA = 4;
        int valueB = 0;

        // Act and Assert
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divideTwoValues(valueA, valueB));
    }

    @Disabled("TODO: Still need to work on it.")
    @DisplayName("Division by zero")
    @Test
    public void testNotImplemented() {
        Assertions.fail("Not implemented yet.");
    }

    @DisplayName("Test 22 + 33 != 50")
    @Test
    public void calculatorDoesNotNeedSumTwoValues() {
        System.out.println("Test 22 + 33 != 50");
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        float result = calculator.sumTwoValues(22f, 33f);

        // Assert
        Assertions.assertNotEquals(50f, result);
    }

    @AfterAll
    public static void cleanUp() {
        System.out.println("Executing @AfterAll method.");
    }
}
