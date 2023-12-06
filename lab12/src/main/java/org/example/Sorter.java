package org.example;

public class Sorter extends Thread {

    private final SyncLinkedList list;
    public Sorter(SyncLinkedList list) {
        this.list = list;
    }

    public void run() {
        while (!isInterrupted()) {
            try {
                sleep(10000);
                System.out.println("Start sorting");
                list.sort();
                System.out.println("Finish sorting");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
