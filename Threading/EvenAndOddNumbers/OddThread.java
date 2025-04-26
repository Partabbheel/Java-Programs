package com.Threading.EvenAndOddNumbers;

public class OddThread extends Thread{
    @Override
    public  void run(){
        for(int i=1;i<=9;i+=2){
            System.out.println("Odd: "+i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
