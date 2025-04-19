package com.Comparator.Bag;

import com.CollectionFramework.Bags.Bag;
import com.Comparator.AgeSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoBag {
    public static void main(String[] args){
        List<Bag> bags = new ArrayList<>();

        Bag Bag1 = new Bag();
        Bag1.setType("Shoulder Bag");
        Bag1.setColor("Black");
        Bag1.setPrice(8000);
        bags.add(Bag1);

        Bag Bag2 = new Bag();
        Bag2.setType("HandBag");
        Bag2.setColor("White");
        Bag2.setPrice(6000);
        bags.add(Bag2);

        Bag Bag3= new Bag();
        Bag3.setType("Travel Bag");
        Bag3.setColor("Blue");
        Bag3.setPrice(15500);
        bags.add(Bag3);


        Bag Bag4 = new Bag();
        Bag4.setType("Clutch Bad");
        Bag4.setColor("Red");
        Bag4.setPrice(4000);
        bags.add(Bag4);


        Bag Bag5= new Bag();
        Bag5.setType("Tote Bag");
        Bag5.setColor("Green");
        Bag5.setPrice(2500);
        bags.add(Bag5);

        Comparator<Bag>PriceSorter = new Comparator<Bag>() {
            @Override
            public int compare(Bag o1, Bag o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }


        };

        System.out.println(bags);
        Collections.sort(bags,PriceSorter);
        System.out.println(bags);


        }
    }
