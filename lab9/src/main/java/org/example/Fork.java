package org.example;

public class Fork {

    private final int id;

    private Boolean isTaken;

    Fork(Integer id) {
        this.id = id;
    }

    public synchronized boolean isTaken() {
        return isTaken;
    }

    public void takeFork(int philosopherId) {
        isTaken = true;
        System.out.println("Fork №" + id + " was TAKEN by Philosopher №" + philosopherId);
    }

    public void putDownFork(int philosopherId) {
        isTaken = false;
        System.out.println("Fork №" + id + " was PUT DOWN by Philosopher №" + philosopherId);
    }

}
