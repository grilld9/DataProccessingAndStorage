package org.example;


import static org.example.Main.addToSum;
import static org.example.Main.getRange;

public class PiCounter extends Thread {


    public void run() {
        while (!isInterrupted()) {
            Range range = getRange();
            long start = range.getStart();
            long end = range.getEnd();
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
}
