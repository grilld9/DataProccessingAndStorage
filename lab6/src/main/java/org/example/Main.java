package org.example;

import java.util.concurrent.BrokenBarrierException;

public class Main {
    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        Company company = new Company(100);
        Founder founder = new Founder(company);
        founder.start();
    }
}