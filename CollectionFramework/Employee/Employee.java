package com.CollectionFramework.Employee;

public class Employee{
       private  String EmployeeName;
       private   int EmployeeId;
       private  double salary;

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeName='" + EmployeeName + '\'' +
                ", EmployeeId=" + EmployeeId +
                ", salary=" + salary +
                '}';
        }
    }

