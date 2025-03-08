package com.CollectionFramework.Bags;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Bag> Baglist = new ArrayList<>();

        Bag Bag1 = new Bag();
        Bag1.setType("Backpack");
        Bag1.setColor("Navy Blue");
        Bag1.setPrice(4500);
        Baglist.add(Bag1);

        Bag Bag2 = new Bag();
        Bag2.setType("Handbag");
        Bag2.setColor("Red");
        Bag2.setPrice(8000);
        Baglist.add(Bag2);

        Bag Bag3 = new Bag();
        Bag3.setType("Luggage");
        Bag3.setColor("Black");
        Bag3.setPrice(18000);
        Baglist.add(Bag3);

        Bag Bag4 = new Bag();
        Bag4.setType("Tote Bag");
        Bag4.setColor("Brown");
        Bag4.setPrice(2500);
        Baglist.add(Bag4);

        Bag Bag5 = new Bag();
        Bag5.setType("Messenger Bag");
        Bag5.setColor("Gray");
        Bag5.setPrice(6000);
        Baglist.add(Bag5);

        Bag Bag6 = new Bag();
        Bag6.setType("Duffel Bag");
        Bag6.setColor("Green");
        Bag6.setPrice(12000);
        Baglist.add(Bag6);

        Bag Bag7 = new Bag();
        Bag7.setType("Clutch Bag");
        Bag7.setColor("Gold");
        Bag7.setPrice(15000);
        Baglist.add(Bag7);

        Bag Bag8 = new Bag();
        Bag8.setType("Satchel Bag");
        Bag8.setColor("Tan");
        Bag8.setPrice(200000);
        Baglist.add(Bag8);

        Bag Bag9 = new Bag();
        Bag9.setType("Crossbody Bag");
        Bag9.setColor("Pink");
        Bag9.setPrice(3500);
        Baglist.add(Bag9);

        Bag Bag10 = new Bag();
        Bag10.setType("Travel Bag");
        Bag10.setColor("Silver");
        Bag10.setPrice(25000);
        Baglist.add(Bag10);

        for(int i=0;i<Baglist.size();i++){
            Bag Bag = Baglist.get(i);
            System.out.println(Bag);
            System.out.println();
        }
    }

}
