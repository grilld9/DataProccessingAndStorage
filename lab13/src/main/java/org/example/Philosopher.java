package org.example;

public class Philosopher extends Thread {

    private final Fork leftFork;
    private final Fork rightFork;
    private final int id;
    public Philosopher(Fork leftFork, Fork rightFork, int id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    private int spaghettiCount = 5;

    public void run() {
        while (!isInterrupted() && spaghettiCount != 0) {
            try {
                leftFork.take();
                if (rightFork.tryTake()) {
                    eat();
                    leftFork.put();
                    rightFork.put();
                    think();
                } else {
                    leftFork.put();
                    think();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void eat() throws InterruptedException {
        System.out.println("Философ " + id + " начал есть");
        sleep(5000);
        spaghettiCount -= 1;
        System.out.println("Философ " + id + " закончил есть (" + spaghettiCount + "/5)");
        System.out.println();
    }

    private void think() throws InterruptedException {
        System.out.println("Философ " + id + " начал думать");
        sleep(6000);
    }

}
