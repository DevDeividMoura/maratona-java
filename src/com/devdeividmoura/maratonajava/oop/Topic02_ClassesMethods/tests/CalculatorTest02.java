package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Calculator;

/**
 * Test class for Calculator multiplication method.
 *
 * @version 1.0
 */
public class CalculatorTest02 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.multiplyTwoNumbers(10, 20);
    }
}
