package com.Comparator.Mobile;

import com.CollectionClass4.Mobile;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoMobile {

    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();

        Mobile mobile1 = new Mobile();

        mobile1.setMobileCompanyName("Vivo");
        mobile1.setStorage("White");
        mobile1.setColor("8GB");
        mobiles.add(mobile1);

        Mobile mobile2 = new Mobile();

        mobile2.setMobileCompanyName("Oppo");
        mobile2.setStorage("Blue");
        mobile2.setColor("128GB");
        mobiles.add(mobile2);

        Mobile mobile3 = new Mobile();

        mobile3.setMobileCompanyName("iPhone 14");
        mobile3.setStorage("256GB");
        mobile3.setColor("Space Gray");
        mobiles.add(mobile3);

        Mobile mobile4 = new Mobile();

        mobile4.setMobileCompanyName("Samsung Galaxy");
        mobile4.setStorage("128GB");
        mobile4.setColor("Cream Green");
        mobiles.add(mobile4);


        Comparator<Mobile> MobileNameSorter = new Comparator<Mobile>() {
            @Override
            public int compare(Mobile o1, Mobile o2) {
                return o1.getMobileCompanyName().compareTo(o2.getMobileCompanyName());
            }
        };
        System.out.println(mobiles);
        Collections.sort(mobiles,MobileNameSorter);
        System.out.println(mobiles);
    }   }