package org.example;

import java.util.concurrent.Semaphore;

public class LineA extends Thread {

    private final Semaphore detailA;

    public LineA(Semaphore detailA) {
        this.detailA = detailA;
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                sleep(1000);
                detailA.release();
                System.out.println("Detail A completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
