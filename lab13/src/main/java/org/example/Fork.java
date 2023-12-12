package org.example;

import java.util.concurrent.Semaphore;

public class Fork {

    private final Semaphore semaphore;
    public Fork(Semaphore semaphore) {
        this.semaphore = semaphore;
    }
    public void take() throws InterruptedException {
        semaphore.acquire();
    }

    public boolean tryTake() {
        return semaphore.tryAcquire();
    }
    public void put() {
        semaphore.release();
    }
}
