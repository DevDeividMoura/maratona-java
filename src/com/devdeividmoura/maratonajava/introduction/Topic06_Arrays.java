package com.devdeividmoura.maratonajava.introduction;

/**
 * Class Topic06_Arrays - Demonstrates the use of arrays in Java.
 *
 * @author DevDeividMoura
 * @version 1.0
 */
public class Topic06_Arrays {
    public static void main(String[] args) {
        // Single-dimensional array initialization
        int[] ages = {21, 15, 11};
        for (int age : ages) {
            System.out.println(age);
        }

        // Default values of arrays
        String[] names = new String[3];
        for (String name : names) {
            System.out.println(name); // Default value: null
        }

        // Initializing an array with values
        String[] initializedNames = {"Goku", "Kurosaki", "Luffy"};
        for (String name : initializedNames) {
            System.out.println(name);
        }

        // Different ways to initialize arrays
        int[] numbers = new int[3];
        int[] numbers2 = new int[]{1, 2, 3, 4, 5};
        int[] numbers3 = {5, 4, 3, 2, 1};

        for (int num : numbers3) {
            System.out.println(num);
        }

        // Multi-dimensional array initialization
        int[][] days = {
                {31, 28, 31},
                {30, 31, 30}
        };

        // Using nested loops to print multi-dimensional array
        for (int[] month : days) {
            for (int day : month) {
                System.out.println(day);
            }
        }

        System.out.println("--------------------------------");

        // Array initialization examples
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {
                {0, 0},
                {1, 2, 3},
                {1, 2, 3, 4, 5, 6}
        };

        for (int[] subArray : arrayInt2) {
            System.out.println("\n-----");
            for (int num : subArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}