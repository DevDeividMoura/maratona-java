package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Functionary;

/**
 * Test class for the Functionary class.
 *
 * @version 1.0
 */
public class FunctionaryTest01 {
    public static void main(String[] args) {
        Functionary functionary = new Functionary();
        functionary.name = "Kakash";
        functionary.age = 37;
        // Uncomment the following line to initialize the salaries array
        // functionary.salaries = new double[]{25000.48, 26780.98, 29850.12};

        functionary.print();
        // functionary.printSalaryMean();
    }
}