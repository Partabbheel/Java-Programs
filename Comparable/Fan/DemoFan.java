package com.Comparable.Fan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoFan {
    public static void main(String[] args){
        List<Fan> fans = new ArrayList<>();

        Fan fan1 = new Fan();
        fan1.setFanName("Orient Fans");
        fan1.setPrice(7000);
        fans.add(fan1);

        Fan fan2 = new Fan();
        fan2.setFanName("Pak Fans");
        fan2.setPrice(6500);
        fans.add(fan2);

        Fan fan3 = new Fan();
        fan3.setFanName("GFC Fans");
        fan3.setPrice(5000);
        fans.add(fan3);

        Fan fan4 = new Fan();
        fan4.setFanName("Hunter Fans");
        fan4.setPrice(8000);
        fans.add(fan4);

        System.out.println(fans);
        Collections.sort(fans);
        System.out.println(fans);


    }
}
