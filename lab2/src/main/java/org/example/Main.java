package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintString printString = new PrintString();
        printString.start();
        printString.join();
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 0: Some string");
        }
    }
}