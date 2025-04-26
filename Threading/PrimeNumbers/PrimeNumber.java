package com.Threading.PrimeNumbers;

public class PrimeNumber extends Thread{
    @Override
    public void run(){
        for(int num = 2;num<= 20;num++){
            boolean isPrime = true;
            for(int i = 2;i<=num/2;i++){
                if(num% i ==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("Prime: "+num);
                try{
                    Thread.sleep(200);

                } catch (InterruptedException e) {

                }
            }
        }
    }
}
