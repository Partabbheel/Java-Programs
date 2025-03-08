package com.CollectionFramework.Car;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Car> carList = new ArrayList<>();

        Car car1 = new Car();
        car1.setCompanyName("Toyota");
        car1.setModelName("Camry XSE");
        car1.setColor("Blue Crush Metallic");
        car1.setPrice(7538.700);
        carList.add(car1);

        Car car2 = new Car();
        car2.setCompanyName("Honda");
        car2.setModelName("Civic type R");
        car2.setColor("Championship white");
        car2.setPrice(10530.075);
        carList.add(car2);

        Car car3 = new Car();
        car3.setCompanyName("Ford Mustang GT");
        car3.setModelName("Mustang GT");
        car3.setColor("Velocity Blue");
        car3.setPrice(10530.075);
        carList.add(car3);

        Car car4 = new Car();
        car4.setCompanyName("Tesla");
        car4.setModelName("Model3");
        car4.setColor("Solid Black");
        car4.setPrice(102333.150);
        carList.add(car4);

        Car car5 = new Car();
        car5.setCompanyName("Nissan");
        car5.setModelName("GT-R");
        car5.setColor("Pearl White");
        car5.setPrice(28513.550);
        carList.add(car5);

        Car car6 = new Car();
        car6.setCompanyName("Chevrolet");
        car6.setModelName("Corvette Stingray");
        car6.setColor("Silver");
        car6.setPrice(17073.475);
        carList.add(car6);

        Car car7 = new Car();
        car7.setCompanyName("Kia");
        car7.setModelName("Telluride SX");
        car7.setColor("White");
        car7.setPrice(124123.50);
        carList.add(car7);

        Car car8 = new Car();
        car8.setCompanyName("Hyundai");
        car8.setModelName("Santa Fe Limited");
        car8.setColor("White");
        car8.setPrice(11148.90);
        carList.add(car8);

        Car car9 = new Car();
        car9.setCompanyName("Mazda");
        car9.setModelName("Mazda3");
        car9.setColor("White");
        car9.setPrice(61788.90);
        carList.add(car9);

        Car car10= new Car();
        car10.setCompanyName("Subaru");
        car10.setModelName("Outback");
        car10.setColor("Crystal white Pearl");
        car10.setPrice(1128098.25);
        carList.add(car10);


       for(int i=0;i<carList.size();i++){
           Car car = carList.get(i);
           System.out.println(car);

           System.out.println();

       }

    }

}
