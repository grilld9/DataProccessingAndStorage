package org.example;

public class Fork {

    private boolean isTaken;

    public synchronized boolean takeFork() {
        if (isTaken) {
            return false;
        } else {
            isTaken = true;
            return true;
        }
    }

    public void putFork() {
        isTaken = false;
    }
}
