package com.example;

import com.example.entities.Calculator;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sumTwoValues(22f, 33f));
        System.out.println(calculator.divideTwoValues(4, 0));
    }
}
