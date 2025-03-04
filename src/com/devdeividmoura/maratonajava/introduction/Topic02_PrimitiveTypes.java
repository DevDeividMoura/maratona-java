package com.devdeividmoura.maratonajava.introduction;

/**
 * Class Topic02_PrimitiveTypes - Demonstration of primitive types usage in Java.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Topic02_PrimitiveTypes {
    public static void main(String[] args) {
        // Integer types
        byte smallNumber = 127;
        short shortNumber = 32000;
        int age = 25;
        long largeNumber = 9_223_372_036_854_775_807L;

        // Floating-point types
        float price = 49.99F;
        double salary = 3500.75;

        // Other primitive types
        boolean isActive = true;
        char nameInitial = 'D';

        // Non-primitive type (String)
        String username = "DevDeividMoura";

        // Printing values
        System.out.println("Byte value: " + smallNumber);
        System.out.println("Short value: " + shortNumber);
        System.out.println("Int (age): " + age);
        System.out.println("Long value: " + largeNumber);
        System.out.println("Float (price): " + price);
        System.out.println("Double (salary): " + salary);
        System.out.println("Boolean (is active?): " + isActive);
        System.out.println("Char (name initial): " + nameInitial);
        System.out.println("String (username): " + username);

        /*
        Practice Exercise

        Create variables for the fields described below <> and print the following message:

        I, <name>, living at <address>, confirm that I received the salary of <salary> on <date>.
         */

        String name = "Deivid";
        String address = "Av Tiradentes, 367, Downtown";
        double receivedSalary = 10780.80;
        String salaryReceiptDate = "25/02/2025"; // dd/MM/yyyy
        String report = "I, " + name + ", living at " + address +
                ", confirm that I received the salary of " + receivedSalary +
                " on " + salaryReceiptDate + ".";

        System.out.println("=================");
        System.out.println("Practice Exercise");
        System.out.println("=================");
        System.out.println("Report: " + report);
    }
}
