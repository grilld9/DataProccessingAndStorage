package org.example;

public class Worker implements Runnable {

    private final Department department;

    Worker(Department department) {
        this.department = department;
    }


    @Override
    public void run() {
        department.performCalculations();
    }
}
