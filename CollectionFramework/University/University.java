package com.CollectionFramework.University;

public class University {
    String UniversityName;
    String Location;
    String Fields;

    University(String UniversityName,String Location,String Fields) {
        this.UniversityName = UniversityName;
        this.Location = Location;
        this.Fields = Fields;
    }

     void DisplayInfo(){
         System.out.println("University:"+UniversityName);
         System.out.println("University Location:"+Location);
         System.out.println("University Fields:"+Fields);

    }



}
