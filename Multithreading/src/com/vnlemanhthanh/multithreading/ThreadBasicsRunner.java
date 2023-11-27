/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.multithreading;

// extends Thread
class Task1 extends Thread {
    public void run() {
        System.out.println("Task1 Started");
        for (int i = 101; i <= 199 ; i++) {
            System.out.printf("%s", i + ((199 != i) ? ", " : "\n"));
        }
        System.out.println("Task1 Done!");
    }
}

// implements Runnable
class Task2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Task2 Started");
        for (int i = 201; i <= 299 ; i++) {
            System.out.printf("%s", i + ((299 != i) ? ", " : "\n"));
        }
        System.out.println("Task2 Done!");
    }
}

public class ThreadBasicsRunner {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.start();

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        System.out.println("Task3 Started");
        for (int i = 301; i <= 399 ; i++) {
            System.out.printf("%s", i + ((399 != i) ? ", " : "\n"));
        }
        System.out.println("Task3 Done!");

        System.out.println("Main Done!");
    }
}
