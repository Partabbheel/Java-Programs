package com.Comparator;

import java.util.*;


public class  DemoSorting {
    public static void main(String[] args){
        List<Laptop> laptops= new ArrayList<>();

        Laptop laptop1 = new Laptop();
        laptop1.setModelName("Dell");
        laptop1.setProcessor("11th Gen Intel Core i5");
        laptop1.setColor("Platinum Silver");
        laptop1.setPrice(170900.0);
        laptops.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setModelName("Hp");
        laptop2.setProcessor("7th Gen Intel Core i7");
        laptop2.setColor("Nightfall Black");
        laptop2.setPrice(50900.90);
        laptops.add(laptop2);

        Laptop laptop3 = new Laptop();
        laptop3.setModelName("Lenovo ThinkPad");
        laptop3.setProcessor("11th Gen Core i8");
        laptop3.setColor("Carbon Fiber");
        laptop3.setPrice(90900.0);
        laptops.add(laptop3);

        Laptop laptop4 = new Laptop();
        laptop4.setModelName("Apple");
        laptop4.setProcessor("Apple M1 Chip");
        laptop4.setColor("Space Gray");
        laptop4.setPrice(24110.0);
        laptops.add(laptop4);

        System.out.println(laptops);
        Collections.sort(laptops,new ModelNameSorter());
        System.out.println(laptops);


        Comparator<Laptop>ModelNameSorter  = new Comparator<Laptop>() {
            @Override
            public int compare(Laptop o1, Laptop o2) {
                return o1.getPrice().compareTo(o2.getPrice());
            }
        };
        System.out.println(laptops);
        Collections.sort(laptops,ModelNameSorter);
        System.out.println(laptops);
    }
}







