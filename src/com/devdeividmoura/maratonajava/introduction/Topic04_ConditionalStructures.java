package com.devdeividmoura.maratonajava.introduction;

/**
 * Class Topic04_ConditionalStructures - Demonstrates the use of conditional structures in Java.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Topic04_ConditionalStructures {
    public static void main(String[] args) {
        // If structure - Checking if a person is allowed to buy alcohol
        int age = 15;
        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol) {
            System.out.println("Authorized to buy alcohol");
        } else {
            System.out.println("Sorry, you are not allowed to buy alcohol");
        }

        // Incorrect assignment inside if condition (for demonstration purposes)
        boolean condition = false;
        if (condition = false) { // This is an assignment, not a comparison
            System.out.println("Inside incorrect condition");
        }
        System.out.println("Outside if");

        // If-else structure - Categorizing based on age
        int personAge = 20;
        String category;

        if (personAge < 15) {
            category = "Junior Category";
        } else if (personAge < 18) {
            category = "Senior Category";
        } else {
            category = "Master Category";
        }
        System.out.println(category);

        // Ternary operator - Donation condition based on salary
        double salary = 6000;
        String donationStatus = salary > 5000 ? "I will donate 500 to DevDojo" : "I can't donate yet, but I will!";
        System.out.println(donationStatus);

        /*
        Exercise 1: Tax Calculation Table

        Taxable Income                     Tax Rate
        | From      | Up to and Including |
        | € 0       | € 34,712            | 9.70%
        | € 34,713  | € 68,507            | 37.35%
        | € 68,508  |                     | 49.50%

        Given a certain annual salary, calculate the tax amount.
        Example: 40,000
        */

        double annualSalary = 40000;
        double firstBracketRate = 9.70 / 100;
        double secondBracketRate = 37.35 / 100;
        double thirdBracketRate = 49.50 / 100;
        double totalTax;

        if (annualSalary <= 34712) {
            totalTax = annualSalary * firstBracketRate;
        } else if (annualSalary <= 68507) {
            totalTax = annualSalary * secondBracketRate;
        } else {
            totalTax = annualSalary * thirdBracketRate;
        }
        System.out.println("Total Tax: " + totalTax);

        // Switch structure - Printing the day of the week, considering 1 as Sunday
        // Traditional syntax
        byte dayOfWeek = 5;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        // New syntax available from Java 14+
        switch (dayOfWeek) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid option");
        }

        /*
        Exercise 2: Identify if a given day is a weekday or a weekend.
        Given values from 1 to 7, print whether it is a weekday or weekend, considering 1 as Sunday.
        */
        // Traditional syntax
        byte day = 6;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        // New syntax available from Java 14+
        switch (day) {
            case 1, 7 -> System.out.println("Weekend");
            case 2, 3, 4, 5, 6 -> System.out.println("Weekday");
            default -> System.out.println("Invalid option");
        }
    }
}
