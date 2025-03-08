package com.CollectionFramework.Laptop;

import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();

        Laptop laptop1 = new Laptop();
        laptop1.setModelName("Dell");
        laptop1.setProcessor("11th Gen Intel Core i5");
        laptop1.setColor("Platinum Silver");
        laptop1.setPrice(170900.0);
        laptopList.add(laptop1);

        Laptop laptop2 = new Laptop();
        laptop2.setModelName("Hp");
        laptop2.setProcessor("7th Gen Intel Core i7");
        laptop2.setColor("Nightfall Black");
        laptop2.setPrice(50900.90);
        laptopList.add(laptop2);

        Laptop laptop3 = new Laptop();
        laptop3.setModelName("Lenovo ThinkPad");
        laptop3.setProcessor("11th Gen Core i8");
        laptop3.setColor("Carbon Fiber");
        laptop3.setPrice(90900.0);
        laptopList.add(laptop3);

        Laptop laptop4 = new Laptop();
        laptop4.setModelName("Apple");
        laptop4.setProcessor("Apple M1 Chip");
        laptop4.setColor("Space Gray");
        laptop4.setPrice(284110.0);
        laptopList.add(laptop4);

        Laptop laptop5 = new Laptop();
        laptop5.setModelName("Acer Aspire");
        laptop5.setProcessor("11th Gen Core i5");
        laptop5.setColor("Black");
        laptop5.setPrice(14200.15);
        laptopList.add(laptop5);

        Laptop laptop6 = new Laptop();
        laptop6.setModelName("Microsoft Surface");
        laptop6.setProcessor("10th Gen Core i6");
        laptop6.setColor("Platinum");
        laptop6.setPrice(284000.0);
        laptopList.add(laptop6);

        Laptop laptop7 = new Laptop();
        laptop7.setModelName("Asus ZenBook");
        laptop7.setProcessor("11th Gen Intel Core i7");
        laptop7.setColor("Silver");
        laptop7.setPrice(19900.70);
        laptopList.add(laptop7);

        Laptop laptop8 = new Laptop();
        laptop8.setModelName("Hp");
        laptop8.setProcessor("AMD 75800H");
        laptop8.setColor("Acid Green");
        laptop8.setPrice(22700.0);
        laptopList.add(laptop8);

        Laptop laptop9 = new Laptop();
        laptop9.setModelName("Dell XPS");
        laptop9.setProcessor("11th Gen Intel Core i7");
        laptop9.setColor("Forst White");
        laptop9.setPrice(28400.44);
        laptopList.add(laptop9);

        Laptop laptop10 = new Laptop();
        laptop10.setModelName("Lenovo Legion");
        laptop10.setProcessor("AMD RyZen 7 500H");
        laptop10.setColor("Black");
        laptop10.setPrice(25600.0);
        laptopList.add(laptop10);

        for(int i = 0;i<laptopList.size();i++){
            Laptop laptop = laptopList.get(i);
            System.out.println(laptop);

            System.out.println();

        }
    }

}
