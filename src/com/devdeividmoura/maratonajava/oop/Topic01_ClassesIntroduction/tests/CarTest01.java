package com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.tests;

import com.devdeividmoura.maratonajava.oop.Topic01_ClassesIntroduction.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car01 = new Car();
        car01.model = "Monza";
        car01.brand = "Chevrolet";
        car01.year = 1982;

        Car car02 = new Car();
        car02.model = "Santana";
        car02.brand = "Volkswagen";
        car02.year = 1984;

        car01 = car02;

        System.out.println("Car01");
        System.out.println("Model: " + car01.model);
        System.out.println("Brand: " + car01.brand);
        System.out.println("Year: " + car01.year);

        System.out.println("-------------------------");

        System.out.println("Car02");
        System.out.println("Model: " + car02.model);
        System.out.println("Brand: " + car02.brand);
        System.out.println("Year: " + car02.year);
    }
}
