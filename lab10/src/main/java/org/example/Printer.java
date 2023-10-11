package org.example;

public class Printer extends Thread {

    private int lastThreadPrinted = 1;

    public void run() {
        int i = 1;
        while (!isInterrupted() && i <= 10) {
            if (printString(1, i)) {
                i++;
            }
        }
    }
    public synchronized boolean printString(int threadNumber, int stringNumber) {
        if (threadNumber != lastThreadPrinted) {
            System.out.println("Thread " + threadNumber + " printed string " + stringNumber);
            lastThreadPrinted = threadNumber;
            return true;
        }
        return false;
    }


}
