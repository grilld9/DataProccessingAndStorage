package org.example;

public class Print {

    public void printString(int threadNumber, int stringNumber)
        throws InterruptedException {
        notifyAll();
        System.out.println("Thread " + threadNumber + " printed string " + stringNumber);
        wait();
    }
}
