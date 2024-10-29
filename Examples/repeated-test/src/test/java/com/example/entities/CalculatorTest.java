package com.example.entities;

import org.junit.jupiter.api.*;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("Test 2 * 2 = 4")
    @RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
    public void mustMultiplyTwoValues() {
        int valueA = 2;
        int valueB = 2;
        int expected = 4;

        int result = calculator.multiply(valueA, valueB);

        Assertions.assertEquals(expected, result, "The multiplication of " + valueA + " and " + valueB + " shouldn't be different from " + expected);
    }

    @DisplayName("Test 2 * 2 != 4")
    @RepeatedTest(value = 3, name = "{displayName}. Repetition {currentRepetition} of {totalRepetitions}")
    public void shouldNotMultiplyCorrectly(RepetitionInfo repetitionInfo, TestInfo testInfo) {
        int valueA = 2;
        int valueB = 2;
        int expected = 5;

        int result = calculator.multiply(valueA, valueB);

        Assertions.assertNotEquals(expected, result, "The multiplication of " + valueA + " and " + valueB + " shouldn't be different from " + expected);
    }
}
