package com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.tests;

import com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.domain.Teacher;

/**
 * Class StudentTest01 - Demonstrates object instantiation and field assignment.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Master Kami";
        teacher.subject = "Matemática";

        System.out.println("Name: " + teacher.name + " Subject: " + teacher.subject);
    }
}
