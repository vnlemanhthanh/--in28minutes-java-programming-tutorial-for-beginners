/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class  Task extends Thread {
    private int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.printf("\nTask %d Started\n", number);
        for (int i = 100 * number; i <= 99 + 100*number ; i++) {
            System.out.printf("%s", i + (((99 + 100*number) != i) ? ", " : " "));
        }
        System.out.printf("\nTask %d Done!\n", number);
    }
}

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(new Task(111));
        executorService.execute(new Task(222));
        executorService.execute(new Task(333));
        executorService.execute(new Task(444));
        executorService.execute(new Task(555));
        executorService.execute(new Task(666));
        executorService.execute(new Task(777));
        executorService.execute(new Task(888));
        executorService.execute(new Task(999));

        executorService.shutdown();
    }


}
