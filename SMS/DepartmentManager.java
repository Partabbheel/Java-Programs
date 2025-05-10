package com.SMS;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class DepartmentManager {
        ArrayList<Department> departments = new ArrayList<>();

        void addDepartment(String name, String code) {
            departments.add(new Department(name, code));
            System.out.println("Department added successfully");
            System.out.println();
        }

        boolean isDepartmentExist(String code) {
            return departments.stream().anyMatch(department -> department.code.equals(code));
        }

        void updateDepartment(String code, String newName, String newCode) {
            departments.stream().filter(department -> department.code == newCode)
                    .findFirst().ifPresentOrElse(department -> {
                        department.name = newName;
                        department.code = newCode;
                        System.out.println("Department deleted Successfully");
                        System.out.println();
                    }, () -> System.out.println("Department not found"));
        }

        void deleteDepartment(String code) {
            if(departments.removeIf(department -> department.code.equals(code))){
                System.out.println("Department deleted Successfully");
                System.out.println();
                }else{
                System.out.println("Department not found");
            }
        }
        void getDepartment(String code) {
            departments.stream().filter(department -> department.code.equals(code))
                    .findFirst().ifPresentOrElse(department ->{
                            department.displayInfo();
                            System.out.println();
            },()-> System.out.println("Department not found"));
        }
        void displayAllDepartments() {
            departments.stream().forEach(department -> department.displayInfo());
        }

}




