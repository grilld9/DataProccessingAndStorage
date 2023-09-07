package org.example;

import static org.example.Main.printStrings;

import java.util.List;

public class StringPrinter extends Thread {

    private final List<String> strings;

    public StringPrinter(List<String> strings) {
        this.strings = strings;
    }


    public void run() {
        printStrings(strings);
    }
}
