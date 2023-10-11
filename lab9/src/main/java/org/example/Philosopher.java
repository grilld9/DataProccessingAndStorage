package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Philosopher extends Thread {

    private Integer currCountOfSpaghetti = 2;
    private final Fork leftFork;
    private final Fork rightFork;
    private final Integer id;
    private final CyclicBarrier barrier;

    Philosopher(Fork leftFork, Fork rightFork, Integer id, CyclicBarrier barrier) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
        this.barrier = barrier;
    }

    public void run() {
        while (!isInterrupted() && currCountOfSpaghetti > 0) {
            if (leftFork.takeFork(id)) {
                if (rightFork.takeFork(id)) {
                    try {
                        eating();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    leftFork.putFork();
                    rightFork.putFork();
                    try {
                        thinking();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    if (id % 2 == 0) {
                        leftFork.putFork();
                        try {
                            thinking();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }

    private void thinking() throws InterruptedException {
        sleep(2000);
    }


    private void eating() throws InterruptedException {
        sleep(2000);
        currCountOfSpaghetti -= 1;
    }
}
