package com.CollectionFramework.Mobile;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        List<Mobile>mobileList = new ArrayList<>();

        Mobile mobile1 = new Mobile();
        mobile1.setCompanyName("SAMSUNG Galasy");
        mobile1.setStorage("128GB");
        mobile1.setCamera("50Mp main camera,2MP ultra-wide  camera");
        mobile1.setPrice(16800.0);
        mobileList.add(mobile1);

        Mobile mobile2 = new Mobile();
        mobile2.setCompanyName("Apple iPhone");
        mobile2.setStorage(" 128GB,");
        mobile2.setCamera("Triple Camera 48MP main Camera");
        mobile2.setPrice(470500.0);
        mobileList.add(mobile2);

        Mobile mobile3 = new Mobile();
        mobile3.setCompanyName("Xiaomi Redmi Note 13Pro");
        mobile3.setStorage("128GB");
        mobile3.setCamera("200MP main Camara");
        mobile3.setPrice(14600.0);
        mobileList.add(mobile3);

        Mobile mobile4 = new Mobile();
        mobile4.setCompanyName("Samsung Galasy S24 Ultra");
        mobile4.setStorage("256GB");
        mobile4.setCamera("200MP");
        mobile4.setPrice(434999.0);
        mobileList.add(mobile4);

        Mobile mobile5 = new Mobile();
        mobile5.setCompanyName("Samsung Galaxy A34");
        mobile5.setStorage(" 128GB");
        mobile5.setCamera("8MP Ultra-wide camera");
        mobile5.setPrice(11600.0);
        mobileList.add(mobile5);

        Mobile mobile6 = new Mobile();
        mobile6.setCompanyName("Vivo");
        mobile6.setStorage("128MB");
        mobile6.setCamera("50MP main camera");
        mobile6.setPrice(90000.0);
        mobileList.add(mobile6);

        Mobile mobile7 = new Mobile();
        mobile7.setCompanyName("Oppo A16");
        mobile7.setStorage("4 64 GB");
        mobile7.setCamera(" 35Mp main Camera");
        mobile7.setPrice( 35000.0);
        mobileList.add(mobile7);

        Mobile mobile8 = new Mobile();
        mobile8.setCompanyName("Itel S25 Ultra");
        mobile8.setStorage("256GB");
        mobile8.setCamera("50MP");
        mobile8.setPrice(49000.0);
        mobileList.add(mobile8);

        for(int i =0;i<mobileList.size();i++){
            Mobile mobile = mobileList.get(i);
            System.out.println(mobile);

            System.out.println();
        }
    }

}
