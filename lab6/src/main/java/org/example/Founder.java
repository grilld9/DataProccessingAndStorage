package org.example;

import java.util.ArrayList;
import java.util.List;

public final class Founder {
    private final List<Thread> workers;
    private final Company company;
    public Founder(final Company company) {
        this.workers = new ArrayList<>(company.getDepartmentsCount());
        this.company = company;

    }
    public void start() throws InterruptedException {
        int departmentsCount = company.getDepartmentsCount();
        for (int i = 0; i < departmentsCount; i++){
            Thread worker = new Thread(new Worker(company.getFreeDepartment(i)));
            workers.add(worker);
            worker.start();
        }
        for (Thread worker : workers) {
            worker.join();
        }
        company.showCollaborativeResult();
    }
}
