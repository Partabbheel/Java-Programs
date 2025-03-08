package com.CollectionFramework.Fan;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Fan> fanList = new ArrayList<>();

        Fan fan1 = new Fan();
        fan1.setCompanyName("Panasonic Fan");
        fan1.setPrice(6000);
        fanList.add(fan1);

        Fan fan2 = new Fan();
        fan2.setCompanyName("Havells Fan");
        fan2.setPrice( 5000);
        fanList.add(fan2);

        Fan fan3 = new Fan();
        fan3.setCompanyName("Orient Fan");
        fan3.setPrice(5000);
        fanList.add(fan3);

        Fan fan4 = new Fan();
        fan4.setCompanyName("Pak Fan");
        fan4.setPrice(8000);
        fanList.add(fan4);

        Fan fan5 = new Fan();
        fan5.setCompanyName("Geepas Fan");
        fan5.setPrice(3000);
        fanList.add(fan5);

        Fan fan6 = new Fan();
        fan6.setCompanyName("Westpoint Fan");
        fan6.setPrice(500);
        fanList.add(fan6);

        Fan fan7 = new Fan();
        fan7.setCompanyName("Super Asia Fan");
        fan7.setPrice(4000);
        fanList.add(fan7);

        Fan fan8 = new Fan();
        fan8.setCompanyName("Electrolux Fan");
        fan8.setPrice(6000);
        fanList.add(fan8);

        Fan fan9 = new Fan();
        fan9.setCompanyName("Noor Fan");
        fan9.setPrice(4500);
        fanList.add(fan9);

        Fan fan10 = new Fan();
        fan10.setCompanyName("Boss Fan");
        fan10.setPrice(4800);
        fanList.add(fan10);

        for(int i= 0;i<fanList.size();i++){
            Fan fan = fanList.get(i);
            System.out.println(fan);
            System.out.println();
        }
    }
}