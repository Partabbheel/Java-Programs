package com.CollectionFramework.University;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<University> universityList = new ArrayList<>();

        University university1 = new University("Quaid-e-Azam", "Islamabad", "Natural Science,Social Science, etc");
        universityList.add(university1);

        University university2 = new University("LUMS", "Lahore", "Engineering,law,Social Science");
        universityList.add(university2);

        University university3 = new University("NUST", "Islamabad", "Engineering,Social Science,Medical Science");
        universityList.add(university3);

        University university4 = new University("University of Punjab", "Lahore", "General Fields");
        universityList.add(university4);

        University university5 = new University("University of Karachi", "Karachi", "Natural Science,Social Science,Medical Science,Engineering");
        universityList.add(university5);

        University university6 = new University("University of Sindh", "Jamshoro", "General University");
        universityList.add(university6);

        University university7 = new University("Aga Khan University", "Karachi", "Medical Science Nursin Education");
        universityList.add(university7);

        University university8 = new University("University of Agriculture Faisalabad", "Fasialabad", "Agriculture,Veterinary Science,Engineering,law");
        universityList.add(university8);

        for(int i=0;i<universityList.size();i++){
            University university = universityList.get(i);
            university.DisplayInfo();
            System.out.println();

        }

    }
}
