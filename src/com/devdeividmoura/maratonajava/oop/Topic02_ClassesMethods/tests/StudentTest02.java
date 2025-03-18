package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Student;

/**
 * Test class for printing student details using the Student's own print method.
 *
 * @version 1.0
 */
public class StudentTest02 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "Naruto";
        student1.age = 12;
        student1.sex = 'M';

        student2.name = "Sakura";
        student2.age = 12;
        student2.sex = 'F';

        student1.print();
        student2.print();
    }
}
