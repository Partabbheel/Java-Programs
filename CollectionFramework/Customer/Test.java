package com.CollectionFramework.Customer;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        Customer customer1 = new Customer("Ali", 24, "Jamshoro");
        customerList.add(customer1);

        Customer customer2 = new Customer("Fatima", 32, "Hyderabad");
        customerList.add(customer2);

        Customer customer3 = new Customer("Aftab Ali", 35, "New York");
        customerList.add(customer3);

        Customer customer4 = new Customer("Ayesha", 28, "Karachi");
        customerList.add(customer4);

        Customer customer5 = new Customer("Ibrahim", 28, "London");
        customerList.add(customer5);

        Customer customer6 = new Customer("Zainab", 25, "Jan Mohammad");
        customerList.add(customer6);

        Customer customer7 = new Customer("Hassan", 30, "Dubai");
        customerList.add(customer7);

        Customer customer8 = new Customer("Raja", 27, "Mirpur khas");
        customerList.add(customer8);

        Customer customer9 = new Customer("Bilal", 40, "Sukkur ");
        customerList.add(customer9);

        Customer customer10 = new Customer("Hassan", 35, "Tharparkar");
        customerList.add(customer10);

        for (int i = 0; i<customerList.size(); i++){
            Customer customer = customerList.get(i);
            customer.displayInfo();
            System.out.println();

        }
    }
}

