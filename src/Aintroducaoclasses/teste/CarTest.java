package Aintroducaoclasses.teste;

import Aintroducaoclasses.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Mustang";
        car1.model = "Gt 500";
        car1.year = 1960;

        car2.name = "M4";
        car2.model = "Sport";
        car2.year = 2020;



        System.out.println("Car 1: ");
        System.out.println(car1.name);
        System.out.println(car1.year);
        System.out.println(car1.model);

        System.out.println();

        System.out.println("Car 2: ");
        System.out.println(car2.name);
        System.out.println(car2.year);
        System.out.println(car2.model);
    }
}
