package com.devdeividmoura.maratonajava.introduction;

/**
 * Class Topic05_Loops - Demonstrates the use of loop structures in Java.
 *
 * @author DevDeividMoura
 * @version 1.1
 */
public class Topic05_Loops {
    public static void main(String[] args) {
        // While loop
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        // Do-while loop
        count = 0;
        do {
            System.out.println("Inside do-while: " + ++count);
        } while (count < 10);

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println("For loop iteration: " + i);
        }

        /*
         * Exercise 1: Print even numbers
         * Print all even numbers from 0 to 1,000,000.
         */
        for (int i = 0; i <= 1_000_000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Break statement example
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
            if (i > 25) { // Prints only the first 25 numbers up to maxValue
                break;
            }
            System.out.println(i);
        }

        /*
         * Exercise 2: Calculate Installments
         * Given a car price, determine in how many installments it can be divided.
         */
        double totalValue = 30_000;
        double minInstallment = 1_000;
        for (int installment = 1; installment <= totalValue; installment++) {
            double installmentValue = totalValue / installment;
            if (installmentValue < minInstallment) {
                break;
            }
            System.out.println("Installment " + installment + ": $ " + installmentValue);
        }

        // Continue statement example
        System.out.println("Skipping multiples of 3:");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue; // Skips the current iteration if i is a multiple of 3
            }
            System.out.println(i);
        }
    }
}

