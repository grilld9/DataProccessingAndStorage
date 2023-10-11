package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker implements Runnable {

    private final Department department;
    private final CyclicBarrier barrier;

    Worker(Department department, CyclicBarrier barrier) {
        this.barrier = barrier;
        this.department = department;
    }


    @Override
    public void run() {
        department.performCalculations();
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            throw new RuntimeException(e);
        }
    }
}
