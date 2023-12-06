package org.example;

import java.util.concurrent.Semaphore;

public class LineB extends Thread {

    private final Semaphore detailB;

    public LineB(Semaphore detailB) {
        this.detailB = detailB;
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                sleep(2000);
                detailB.release();
                System.out.println("Detail B completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
