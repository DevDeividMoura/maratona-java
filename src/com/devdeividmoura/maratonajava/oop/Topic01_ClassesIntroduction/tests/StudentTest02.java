package com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.tests;

import com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.domain.Student;

/**
 * Class StudentTest02 - Demonstrates default values in Java objects.
 * Compares attributes of two different instances.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Sanji";

        System.out.println(student1.age); // Default int value: 0
        System.out.println(student1.sex); // Default char value: '\u0000'
        System.out.println(student1.name);

        System.out.println("-------------------");

        System.out.println(student2.age); // Default int value: 0
        System.out.println(student2.sex); // Default char value: '\u0000'
        System.out.println(student2.name); // Default String value: null
    }
}
