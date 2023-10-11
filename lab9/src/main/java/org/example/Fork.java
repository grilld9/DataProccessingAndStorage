package org.example;

public class Fork {

    private boolean isTaken;
    private final int id;
    private int takenByPhilosopherWithId;
    Fork(int id) {
        this.id = id;
    }

    public synchronized boolean takeFork(int philosopherId) {
        if (isTaken && takenByPhilosopherWithId != philosopherId) {
            return false;
        } else {
            isTaken = true;
            takenByPhilosopherWithId = philosopherId;
            return true;
        }
    }

    public void putFork() {
        isTaken = false;
    }
}
