package com.Threading.ReverseString;

public class ReverseStringThread extends Thread{
    private String str;

    public ReverseStringThread(String str){
        this.str = str;
    }
    @Override
    public void run(){
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed String: "+ reversed);

    }
}
