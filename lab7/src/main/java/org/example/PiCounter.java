package org.example;

import static org.example.Main.addToSum;

public class PiCounter extends Thread {

    private final Long start;
    private final Long end;


    PiCounter(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        double threadResult = 0.0;
        for (long i = start; i < end; i++) {
            double term = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                threadResult += term;
            } else {
                threadResult -= term;
            }
        }
        addToSum(threadResult);
    }
}
