package com.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setName("Nazir");
        student1.setAge(31);
        student1.setRollNumber("123");
        students.add(student1);

        Student student2 = new Student();
        student2.setName("Sajid");
        student2.setAge(28);
        student2.setRollNumber("234");
        students.add(student2);

        Student student3 = new Student();
        student3.setName("Raja");
        student3.setAge(22);
        student3.setRollNumber("345");
        students.add(student3);

        Student student4 = new Student();
        student4.setName("Aslam");
        student4.setAge(27);
        student4.setRollNumber("456");
        students.add(student4);

        Comparator<Student>nameSorter = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        System.out.println(students);
        Collections.sort(students,nameSorter);
        System.out.println(students);
        Collections.sort(students,new AgeSorter());
        System.out.println(students);

    }
}


