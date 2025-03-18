package com.devdeividmoura.maratonajava.oop.Topic02_ClassesMethods.domain;

/**
 * Represents a student with basic attributes.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Student {
    public String name;
    public int age;
    public char sex;

    /**
     * Prints the student details to the console.
     */
    public void print() {
        System.out.println("-----------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Sex: " + this.sex);
    }
}
