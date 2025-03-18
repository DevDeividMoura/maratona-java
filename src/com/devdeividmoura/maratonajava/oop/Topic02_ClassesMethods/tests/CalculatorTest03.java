package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Calculator;

/**
 * Test class for Calculator division method.
 *
 * @version 1.0
 */
public class CalculatorTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double dividend = 28;
        double divisor = 3;
        double result = calculator.divideTwoNumbers(dividend, divisor);
        System.out.println("Division result: " + result);
    }
}
