package org.example;

public class SyncLinkedList {

    private Node head = new Node("");
    private Integer count = 0;

    public void add(String str) {
        Node newNode = new Node(str);
        synchronized (head) {
            count++;
            head.setNext(newNode);
            newNode.setPrev(head);
            head = newNode;
        }
    }
    public void print() {
        synchronized (head) {
            Node currNode = head;
            while (currNode != null) {
                System.out.println(currNode.getStr());
                currNode = currNode.getPrev();
            }
        }
    }

    public void sort() {
        if (count < 2) {
            return;
        }
        synchronized (head) {
            int n = count;
            boolean swapped;
            do {
                swapped = false;
                Node currNode = head;
                for (int i = 0; i < n - 1; i++) {
                    if (currNode.getStr().compareTo(currNode.getPrev().getStr()) > 0) {
                        swap(currNode, currNode.getPrev());
                        swapped = true;
                    }
                    currNode = currNode.getPrev();
                }
                n--;
            } while (swapped);
        }
    }

    private void swap(Node x, Node y) {
        String temp = x.getStr();
        x.setStr(y.getStr());
        y.setStr(temp);
    }
}
