package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException {
        List<Fork> forks = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            forks.add(new Fork(i));
        }
        CyclicBarrier barrier = new CyclicBarrier(6);
        List<Philosopher> philosophers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            philosophers.add(new Philosopher(forks.get(i + 1), forks.get(i), i, barrier));
        }
        philosophers.add(new Philosopher(forks.get(0), forks.get(4), 4, barrier)); // замыкает круг
        for (Philosopher philosopher : philosophers) {
            philosopher.start();
        }
        barrier.await();
    }
}