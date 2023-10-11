package org.example;

public class Philosopher extends Thread {

    private Integer currCountOfSpaghetti = 10;
    private final Fork leftFork;
    private final Fork rightFork;
    private final Integer id;

    Philosopher(Fork leftFork, Fork rightFork, Integer id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    public void run() {
        while (!isInterrupted()) {
            if (leftFork.takeFork()) {
                if (rightFork.takeFork()) {
                    try {
                        eating();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    leftFork.putFork();
                    rightFork.putFork();
                    try {
                        thinking();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            } else {
                while(!leftFork.takeFork());

            }
        }
    }
    private void thinking() throws InterruptedException {
        sleep(2000);
    }


    private void eating() throws InterruptedException {
        sleep(2000);
        currCountOfSpaghetti -= 1;
    }

}
