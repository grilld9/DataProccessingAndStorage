package org.example;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.start();
        int i = 1;
        while (i <= 10) {
            if(printer.printString(0, i)) i++;
        }
    }
}