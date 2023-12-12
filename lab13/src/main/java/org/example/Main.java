package org.example;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Fork fork1 = new Fork(new Semaphore(1));
        Fork fork2 = new Fork(new Semaphore(1));
        Fork fork3 = new Fork(new Semaphore(1));
        Fork fork4 = new Fork(new Semaphore(1));
        Fork fork5 = new Fork(new Semaphore(1));
        Philosopher philosopher1 = new Philosopher(fork1, fork2, 1);
        philosopher1.start();
        Philosopher philosopher2 = new Philosopher(fork2, fork3, 2);
        philosopher2.start();
        Philosopher philosopher3 = new Philosopher(fork3, fork4, 3);
        philosopher3.start();
        Philosopher philosopher4 = new Philosopher(fork4, fork5, 4);
        philosopher4.start();
        Philosopher philosopher5 = new Philosopher(fork5, fork1, 5);
        philosopher5.start();
    }
}