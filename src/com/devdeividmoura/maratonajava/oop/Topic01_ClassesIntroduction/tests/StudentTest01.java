package com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.tests;

import com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.domain.Student;

/**
 * Class StudentTest01 - Demonstrates object instantiation and field assignment.
 * Shows how to create an object and assign values to its attributes.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 21;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);
    }
}