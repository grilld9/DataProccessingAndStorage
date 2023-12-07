package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        SyncLinkedList list = new SyncLinkedList();
        Sorter sorter = new Sorter(list);
        sorter.start();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while(true) {
                String str = reader.readLine();
                if (str.isEmpty()) {
                    list.print();
                } else {
                    list.add(str);
                }
            }
        }
    }
}