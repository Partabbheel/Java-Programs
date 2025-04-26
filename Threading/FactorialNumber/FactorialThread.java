package com.Threading.FactorialNumber;

public class FactorialThread extends Thread{
    private int number;
    FactorialThread(int number){
        this.number = number;
    }
    @Override
    public void run(){
        int fact =1;
        for(int i = 1;i<=number;i++){
            fact *=i;
            try{
                Thread.sleep(300);
            } catch (InterruptedException e) {

            }
            System.out.println("Factorial of "+number+" is "+fact);
        }
    }
}
