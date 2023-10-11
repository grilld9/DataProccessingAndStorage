package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public final class Founder {
    private final Company company;
    public Founder(final Company company) {
        this.company = company;

    }
    public void start() throws InterruptedException, BrokenBarrierException {
        int departmentsCount = company.getDepartmentsCount();
        CyclicBarrier barrier = new CyclicBarrier(departmentsCount);
        for (int i = 0; i < departmentsCount; i++){
            new Thread(new Worker(company.getFreeDepartment(i), barrier));
        }
        barrier.await();
        company.showCollaborativeResult();
    }
}
