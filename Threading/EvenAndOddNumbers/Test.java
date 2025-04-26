package com.Threading.EvenAndOddNumbers;

public class Test {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();
        OddThread oddThread = new OddThread();
        oddThread.start();
    }
}
