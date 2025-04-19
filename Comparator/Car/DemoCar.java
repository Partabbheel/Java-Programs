package com.Comparator.Car;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoCar {
    public static void main (String[] args){
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car();
        car1.setCompanyName("Toyota Camry");
        car1.getColor("Red");
        car1.setPrice(4.690000);
        cars.add(car1);

        Car car2 = new Car();
        car2.setCompanyName("Honda Civic");
        car2.getColor("White");
        car2.setPrice(100.500);
        cars.add(car2);

        Car car3 = new Car();
        car3.setCompanyName("Ford F-150");
        car3.getColor("Black");
        car3.setPrice(15.900000);
        cars.add(car3);

        Car car4 = new Car();
        car4.setCompanyName("Tesla  Model3");
        car4.getColor("Red");
        car3.setPrice(14.70000);
        cars.add(car4);


        Comparator<Car>CompanyNameSorter = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getCompanyName().compareTo(o2.getCompanyName());
            }
        };
        System.out.println(cars);
        Collections.sort(cars,CompanyNameSorter);
        System.out.println(cars);

    }
}


