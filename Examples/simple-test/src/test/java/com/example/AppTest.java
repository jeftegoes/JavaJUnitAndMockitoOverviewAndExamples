package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AppTest {
    @Test
    public void calculatorMustSumTwoValues() {
        Calculator calculator = new Calculator();
        float result = calculator.sumTwoValues(22f, 33f);
        assertEquals(55f, result);
    }

    @Test
    public void calculatorDoesNotNeedSumTwoValues() {
        Calculator calculator = new Calculator();
        float result = calculator.sumTwoValues(22f, 33f);
        assertNotEquals(50f, result);
    }
}
