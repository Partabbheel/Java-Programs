package com.CollectionFramework.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Teacher> teacherList = new ArrayList<>();

        Teacher teacher1 = new Teacher();
        teacher1.setName("Imtiaz ");
        teacher1.setSubject("Machine Leaning");
        teacher1.setDepartment("Computer Science");
        teacherList.add(teacher1);

        Teacher teacher2 = new Teacher();
        teacher2.setName("Imran Ali ");
        teacher2.setSubject("AI");
        teacher2.setDepartment("Information Technology");
        teacherList.add(teacher2);

        Teacher teacher3 = new Teacher();
        teacher3.setName("Shah Nawaz");
        teacher3.setSubject("Pre-Culculus");
        teacher3.setDepartment("Computer Science");
        teacherList.add(teacher3);

        Teacher teacher4 = new Teacher();
        teacher4.setName("Aftab ");
        teacher4.setSubject("Data Science");
        teacher4.setDepartment("Software Engineering");
        teacherList.add(teacher4);

        Teacher teacher5 = new Teacher();
        teacher5.setName("Ayaz Samoo ");
        teacher5.setSubject("English");
        teacher5.setDepartment("Physics");
        teacherList.add(teacher5);

        Teacher teacher6 = new Teacher();
        teacher6.setName("Naseem khan");
        teacher6.setSubject("Java programming");
        teacher6.setDepartment("Computer Science");
        teacherList.add(teacher6);

        Teacher teacher7 = new Teacher();
        teacher7.setName("Saleem");
        teacher7.setSubject("Python for Data Science");
        teacher7.setDepartment("IT");
        teacherList.add(teacher7);

        Teacher teacher8 = new Teacher();
        teacher8.setName("Javed");
        teacher8.setSubject("Data Structure ");
        teacher8.setDepartment("Computer Science");
        teacherList.add(teacher8);

        Teacher teacher9 = new Teacher();
        teacher9.setName("Shah Murad ");
        teacher9.setSubject("Web-development");
        teacher9.setDepartment("IT");
        teacherList.add(teacher9);

        Teacher teacher10 = new Teacher();
        teacher10.setName("Ashfaque Ahmed");
        teacher10.setSubject("Computer Networking");
        teacher10.setDepartment("Computer Science");
        teacherList.add(teacher10);

        for(int i = 0;i<teacherList.size();i++){
            Teacher teacher = teacherList.get(i);
            System.out.println(teacher);

            System.out.println();
        }
    }

}
