package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain;

/**
 * Provides basic arithmetic operations.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Calculator {

    /**
     * Sums two fixed numbers (10 + 10) and prints the result.
     */
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    /**
     * Subtracts two fixed numbers (21 - 2) and prints the result.
     */
    public void subtractTwoNumbers() {
        System.out.println(21 - 2);
    }

    /**
     * Multiplies two numbers and prints the result.
     *
     * @param num1 the first number
     * @param num2 the second number
     */
    public void multiplyTwoNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    /**
     * Divides two numbers and returns the result.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     * @return the division result, or 0 if the divisor is 0
     */
    public double divideTwoNumbers(double num1, double num2) {
        if(num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    /**
     * Divides two numbers and prints the result.
     *
     * @param num1 the dividend
     * @param num2 the divisor
     */
    public void printDivisionOfTwoNumbers(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            return;
        }
        System.out.println(num1 / num2);
    }

    /**
     * Demonstrates parameter passing by attempting to change the values of the provided numbers.
     * Note: Since primitives are passed by value, the original variables remain unchanged.
     *
     * @param num1 the first number
     * @param num2 the second number
     */
    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    /**
     * Sums all the elements of an array and prints the result.
     *
     * @param numbers an array of integers
     */
    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
