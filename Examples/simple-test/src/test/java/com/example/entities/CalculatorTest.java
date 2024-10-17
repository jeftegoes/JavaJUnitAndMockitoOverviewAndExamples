package com.example.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void calculatorMustSumTwoValues() {
        Calculator calculator = new Calculator();
        float result = calculator.sumTwoValues(22f, 33f);
        Assertions.assertEquals(55f, result);
    }

    @Test
    public void calculatorDoesNotNeedSumTwoValues() {
        Calculator calculator = new Calculator();
        float result = calculator.sumTwoValues(22f, 33f);
        Assertions.assertNotEquals(50f, result);
    }
}
