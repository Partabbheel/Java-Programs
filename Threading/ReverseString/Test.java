package com.Threading.ReverseString;

public class Test {
    public static void main(String[] args) {
        String original = "Hello World";

        ReverseStringThread thread = new ReverseStringThread(original);
        thread.start();
    }
}
