package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain;

/**
 * Represents a functionary (employee) with a name, age, and an array of salaries.
 *
 * The class provides methods to print details and calculate the average salary.
 *
 * @author
 * @version 1.0
 */
public class Functionary {
    public String name;
    public int age;
    public double[] salaries;

    /**
     * Prints the functionary's details including salary information.
     */
    public void print() {
        System.out.println("--------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        if (this.salaries == null) {
            return;
        }
        for (int i = 0; i < this.salaries.length; i++) {
            System.out.println("Salary " + (i + 1) + ": " + this.salaries[i]);
        }
        printSalaryMean();
    }

    /**
     * Calculates and prints the average salary.
     */
    public void printSalaryMean() {
        if (this.salaries == null) {
            return;
        }
        double total = 0;
        for (double salary : this.salaries) {
            total += salary;
        }
        double mean = total / this.salaries.length;
        System.out.println("The average salary is: " + mean);
    }
}
