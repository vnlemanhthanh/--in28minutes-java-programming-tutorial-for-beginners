/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("Task3 Started");
        for (int i = 301; i <= 399 ; i++) {
            System.out.printf("%s", i + ((399 != i) ? ", " : "\n"));
        }
        System.out.println("Task3 Done!");

        System.out.println("Main Done!");

        executorService.shutdown();
    }
}
