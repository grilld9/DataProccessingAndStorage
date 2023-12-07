package org.example;

public class Node {

    private String str;
    private Node next;
    private Node prev;

    public void setStr(String str) {
        this.str = str;
    }

    public Node getNext() {
        return next;
    }

    public String getStr() {
        return str;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node(String str) {
        this.str = str;
    }

}
