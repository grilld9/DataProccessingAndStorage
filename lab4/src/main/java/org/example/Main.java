package org.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TextPrinter textPrinter = new TextPrinter();
        textPrinter.start();
        Thread.sleep(2000);
        textPrinter.interrupt();
    }
}