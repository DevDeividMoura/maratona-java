package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.tests;

import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.Student;
import com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain.StudentPrinter;

/**
 * Test class for printing student details using StudentPrinter.
 *
 * @version 1.0
 */
public class StudentTest01 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        StudentPrinter studentPrinter = new StudentPrinter();

        student1.name = "Naruto";
        student1.age = 12;
        student1.sex = 'M';

        student2.name = "Sakura";
        student2.age = 12;
        student2.sex = 'F';

        studentPrinter.print(student1);
        studentPrinter.print(student2);

        System.out.println("========================");

        studentPrinter.print(student1);
        studentPrinter.print(student2);
    }
}
