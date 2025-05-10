package com.SMS;
import java.util.*;

public class StudentManager {
        ArrayList<Student> students = new ArrayList<>();
        DepartmentManager deptManager;

        StudentManager(DepartmentManager deptManager) {

            this.deptManager = deptManager;
        }

        void addStudent(int id, String name, String rollNo, String departmentCode) {
            if (deptManager.isDepartmentExist(departmentCode)) {
                students.add(new Student(id, name, rollNo, departmentCode));
                System.out.println("Student added successfully");
            } else {
                System.out.println("Department not found");

            }
            System.out.println();
        }

        void updateStudent(int id, String newName, String newRollNo, String newDepartmentCode) {
            students.stream().filter(student -> student.id == id).findFirst().ifPresentOrElse(student -> {
                student.name = newName;
                student.rollNo = newRollNo;
                student.departmentCode = newDepartmentCode;
                System.out.println("Student update Successfully");
                System.out.println();
            }, () -> System.out.println("Student not found"));
        }

        void deleteStudent(int id) {
            if (students.removeIf(student -> student.id == id)) {
                System.out.println("Student deleted Successfully");
                System.out.println();
            } else {
                System.out.println("Student not Found");
            }
        }
            void getStudent ( int i ){
                students.stream().filter(student -> student.id== student.id).findFirst()
                        .ifPresentOrElse(Student -> {
                            Student.displayInfo();
                            System.out.println();
                        }, () -> System.out.println("Student  not Found"));
            }
                void displayAllStudents () {
                    students.stream().forEach(student -> {
                        student.displayInfo();
                        System.out.println();
                    } );
               }

}





