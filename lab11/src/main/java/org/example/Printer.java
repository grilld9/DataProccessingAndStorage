package org.example;

import java.util.concurrent.Semaphore;

public class Printer extends Thread {

    private final Semaphore parentSemaphore, childSemaphore;
    Printer(Semaphore parentSemaphore, Semaphore childSemaphore) {
        this.parentSemaphore = parentSemaphore;
        this.childSemaphore = childSemaphore;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                childSemaphore.acquire();
                System.out.println("Child thread prints string " + i);
                String s;
                s.
                parentSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
