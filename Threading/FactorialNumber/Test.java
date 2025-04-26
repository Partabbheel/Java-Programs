package com.Threading.FactorialNumber;

public class Test {
    public static void main(String[] args) {
        FactorialThread factorialThread =new FactorialThread(5);
        Thread thread = new Thread(factorialThread);
        thread.start();
    }
}
