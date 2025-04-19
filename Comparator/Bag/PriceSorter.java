package com.Comparator.Bag;

import java.util.Comparator;

public class PriceSorter implements Comparator<Bag> {
    @Override
    public int compare(Bag o1, Bag o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1;
        }
        else if(o1.getPrice()<o2.getPrice()){
            return -1;
        }else{
            return 0;
        }
    }
    }

