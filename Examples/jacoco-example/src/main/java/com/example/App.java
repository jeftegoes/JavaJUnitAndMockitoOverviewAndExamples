package com.example;

import com.example.entities.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inform first Operand: ");
        float firstOperand = Float.parseFloat(reader.readLine());

        System.out.print("Inform second Operand: ");
        float secondOperand = Float.parseFloat(reader.readLine());

        System.out.print("Now the mathematical mathematicalOperator: ");
        char mathematicalOperator = reader.readLine().charAt(0);

        Calculator calculator = new Calculator();

        System.out.println("Calculator resul: " + calculator.calculate(firstOperand, secondOperand, mathematicalOperator));
    }
}