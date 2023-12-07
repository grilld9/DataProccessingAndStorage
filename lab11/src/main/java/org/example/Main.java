package org.example;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Semaphore parentSemaphore = new Semaphore(1, true);
        Semaphore childSemaphore = new Semaphore(0);
        Printer printer = new Printer(parentSemaphore, childSemaphore);
        printer.start();
        for (int i = 1; i <= 10; i++) {
            parentSemaphore.acquire();
            System.out.println("Parent thread prints string " + i);
            childSemaphore.release();
        }
    }
}