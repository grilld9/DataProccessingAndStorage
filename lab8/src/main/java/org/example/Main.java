package org.example;

import sun.misc.Signal;
import sun.misc.SignalHandler;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static double sum;
    private static long start = 0;
    private static long end = 0;

    public static void main(String[] args) throws InterruptedException {
        int threadCount = Integer.parseInt(args[0]);
        List<PiCounter> piCounters = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            PiCounter piCounter = new PiCounter();
            piCounter.start();
            piCounters.add(piCounter);
        }
        Signal sigInt = new Signal("INT");
        Signal.handle(sigInt, new SignalHandler() {
            public void handle(Signal sig) {
                System.out.println("Received SIGINT signal.");
//                piCounters.get(0).interrupt();
//                piCounters.get(1).interrupt();
                for (PiCounter piCounter : piCounters) {
                    piCounter.interrupt();
                }
                for (PiCounter piCounter : piCounters) {
                    try {
                        piCounter.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                sum *= 4;
                System.out.println("Result = " + sum);
                System.exit(0);
            }
        });
        for (;;) {
            Thread.sleep(10000);
        }
    }

    synchronized public static void addToSum(double term) {
        sum += term;
    }

    synchronized public static Range getRange() {
        if (start == 0 && end == 0) {
            end = 100000;
            return new Range(start, end);
        }
        start += 100000;
        end += 100000;
        return new Range(start, end);
    }

}