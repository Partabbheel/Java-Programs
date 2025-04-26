package com.Threading.FibonacciSeries;

public class FibonacciThread extends Thread{
    @Override
    public void run(){
        int a = 0;
        int b = 1;
        int n = 10;
        System.out.println("Fibonacci: "+ a +","+b);
        for(int i = 2;i<n;i++){
            int c = a+b;
            System.out.println(","+ c);
            a = b;
            b = c;
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
