package com.CollectionFramework.Customer;

public class Customer {
         String name;
         int age;
         String address;

        Customer(String name, int age, String address){
            this.name = name;
            this.address = address;
            this.age = age;
        }

        void displayInfo(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Address: "+address);

        }
}

