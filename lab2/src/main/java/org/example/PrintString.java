package org.example;

public class PrintString extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1: Some string");
        }
    }
}
