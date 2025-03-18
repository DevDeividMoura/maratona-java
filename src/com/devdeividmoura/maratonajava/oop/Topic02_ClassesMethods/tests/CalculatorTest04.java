package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Calculator;

/**
 * Test class to demonstrate the behavior of parameter passing for primitive types.
 *
 * @version 1.0
 */
public class CalculatorTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1, num2);
        System.out.println("Inside CalculatorTest04:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
