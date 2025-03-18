package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain;

/**
 * Provides functionality to print student details.
 * Also demonstrates that passing an object allows modifications to its attributes.
 *
 * @author
 * @version 1.0
 */
public class StudentPrinter {

    /**
     * Prints the details of the given student and updates the student's name to "Goku".
     *
     * @param student the student to be printed and updated
     */
    public void print(Student student) {
        System.out.println("-----------------");
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Sex: " + student.sex);

        // Modify the student's name as a demonstration of object reference behavior
        student.name = "Goku";
    }
}
