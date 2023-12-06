package org.example;

import java.util.concurrent.Semaphore;

public class LineWidget extends Thread {

    private final Semaphore detailA;
    private final Semaphore detailB;
    private final Semaphore detailC;

    public LineWidget(Semaphore detailA, Semaphore detailB, Semaphore detailC) {
        this.detailA = detailA;
        this.detailB = detailB;
        this.detailC = detailC;
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                detailA.acquire();
                detailB.acquire();
                detailC.acquire();
                System.out.println("Widget completed");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
