package org.example;

public class Printer extends Thread {

    private final int printerId;
    private Printer foreignPrinter;
    private final Print print;
    public Printer(int printerId, Print print) {
        this.printerId = printerId;
        this.print = print;
    }

    public void run() {
        for (int i = 0;i < 10; i++) {
            synchronized (print) {
                try {
                    print.printString(printerId, i);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


}
