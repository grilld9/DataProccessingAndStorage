package org.example;

import java.util.concurrent.Semaphore;

public class LineC extends Thread {
    private final Semaphore detailC;

    public LineC(Semaphore detailA, Semaphore detailB, Semaphore detailC) {
        this.detailC = detailC;
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                sleep(3000);
                detailC.release();
                System.out.println("Detail C completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
