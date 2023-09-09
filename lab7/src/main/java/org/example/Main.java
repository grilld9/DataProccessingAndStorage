package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static double sum;

    public static void main(String[] args) throws InterruptedException {
        long iterationCount = 10000000000L;
        int threadCount = Integer.parseInt(args[0]);
        List<PiCounter> piCounters = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            // у каждого треда свой отрезок
            long start = i * (iterationCount / threadCount);
            long end = (i == threadCount - 1) ? iterationCount : (i + 1) * (iterationCount / threadCount);
            PiCounter piCounter = new PiCounter(start, end);
            piCounter.start();
            piCounters.add(piCounter);
        }
        for (PiCounter piCounter : piCounters) {
            piCounter.join();
        }
        sum *= 4;
        System.out.println("Result = " + sum);
    }

    synchronized public static void addToSum(double term) {
        sum += term;
    }
}