package org.example;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore detailA = new Semaphore(0);
        Semaphore detailB = new Semaphore(0);
        Semaphore detailC = new Semaphore(0);
        LineA lineA = new LineA(detailA);
        LineB lineB = new LineB(detailB);
        LineC lineC = new LineC(detailA, detailB, detailC);
        LineWidget lineWidget = new LineWidget(detailA, detailB, detailC);
        lineA.start();
        lineB.start();
        lineC.start();
        lineWidget.start();
    }
}