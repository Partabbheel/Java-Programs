package com.CollectionFramework.Employee;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee();
        employee1.setEmployeeName("Asslam");
        employee1.setEmployeeId(24);
        employee1.setSalary(670000);

        Employee employee2 = new Employee();
        employee2.setEmployeeName("Ali");
        employee2.setEmployeeId(24);
        employee2.setSalary(500000);
        employeeList.add(employee2);

        Employee employee3 = new Employee();
        employee3.setEmployeeName("Sagar");
        employee3.setEmployeeId(25);
        employee3.setSalary(550000);
        employeeList.add(employee3);

        Employee employee4 = new Employee();
        employee4.setEmployeeName("Ahmed");
        employee4.setEmployeeId(26);
        employee4.setSalary(600000);
        employeeList.add(employee4);

        Employee employee5 = new Employee();
        employee5.setEmployeeName("Monesh Kumar");
        employee5.setEmployeeId(26);
        employee5.setSalary(650000);
        employeeList.add(employee5);

        Employee employee6 = new Employee();
        employee6.setEmployeeName("Mahveer");
        employee6.setEmployeeId(28);
        employee6.setSalary(700000);
        employeeList.add(employee6);

        Employee employee7 = new Employee();
        employee7.setEmployeeName("Fatima");
        employee7.setEmployeeId(30);
        employee7.setSalary(870000);
        employeeList.add(employee7);

        Employee employee8 = new Employee();
        employee8.setEmployeeName("Arjan");
        employee8.setEmployeeId(30);
        employee8.setSalary(600000);
        employeeList.add(employee8);

        Employee employee9 = new Employee();
        employee9.setEmployeeName("Aftab Ali");
        employee9.setEmployeeId(32);
        employee9.setSalary(780000);
        employeeList.add(employee9);

        Employee employee10 = new Employee();
        employee10.setEmployeeName("Parkash");
        employee10.setEmployeeId(27);
        employee10.setSalary(700000);
        employeeList.add(employee10);

        for (int i = 0; i<employeeList.size(); i++){
            Employee employee = employeeList.get(i);
            System.out.println(employee);
            System.out.println();
        }
    }
}

