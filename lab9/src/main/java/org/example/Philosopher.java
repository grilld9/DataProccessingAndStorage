package org.example;

public class Philosopher extends Thread {

    private Integer currCountOfSpaghetti = 10;
    private Fork leftFork;
    private Fork rightFork;
    private final Integer id;

    Philosopher(Fork leftFork, Fork rightFork, Integer id) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
        this.id = id;
    }

    public int getCurrCountOfSpaghetti() {
        return currCountOfSpaghetti;
    }

    public void run() {


    }

    private void thinking() throws InterruptedException {
        sleep(1000);
    }

    private void eating() throws InterruptedException {
        for(;;) {
            leftFork.takeFork(id);
            if (rightFork.isTaken()) {
                leftFork.putDownFork(id);
            }
        }


        sleep(1000);
        currCountOfSpaghetti -= 1;
    }

}
