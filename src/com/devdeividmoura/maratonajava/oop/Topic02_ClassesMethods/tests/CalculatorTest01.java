package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Calculator;

/**
 * Test class for basic Calculator operations.
 *
 * Demonstrates the sum and subtraction methods.
 *
 * @version 1.0
 */
public class CalculatorTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        System.out.println("Finalizing CalculatorTest01");
        calculator.subtractTwoNumbers();
    }
}
