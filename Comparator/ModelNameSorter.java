package com.Comparator;

import java.util.Comparator;

public class ModelNameSorter implements Comparator<Laptop>{

    @Override
    public int compare(Laptop o1, Laptop o2) {
        if(o1.getPrice()> o2.getPrice()){
            return 1;
        }
        else if(o1.getPrice()<o2.getPrice()){
            return -1;
        }else{
        return 0;
    }
}}

