package com.Threading.PrimeNumbers;

public class Test {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        Thread thread = new Thread(primeNumber);
        thread.start();
        System.out.println("Name "+thread.getName());
    }
}
