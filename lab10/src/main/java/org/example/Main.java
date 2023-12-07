package org.example;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Print print = new Print();
        Printer printer1 = new Printer(1, print);
        Printer printer2 = new Printer(2, print);
        printer1.start();
        printer2.start();
    }
}