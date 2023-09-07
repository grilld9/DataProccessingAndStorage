package org.example;

public class TextPrinter extends Thread {

    public void run() {
        while (!this.isInterrupted()) {
            System.out.println("Stop me please");
        }
        System.out.println("Thread interrupted");
    }
}
