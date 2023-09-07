package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Company company = new Company(100);
        Founder founder = new Founder(company);
        founder.start();
    }
}