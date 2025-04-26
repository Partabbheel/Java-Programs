package com.Threading.FibonacciSeries;

public class Test {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        fibonacciThread.start();
    }
}
