/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.multithreading;

public class ThreadBasicsRunner {
    public static void main(String[] args) {
        for (int i = 101; i <= 199 ; i++) {
            System.out.printf("%s", i + ((199 != i) ? ", " : "\n"));
        }
        System.out.println("Task1 Done!");

        for (int i = 201; i <= 299 ; i++) {
            System.out.printf("%s", i + ((299 != i) ? ", " : "\n"));
        }
        System.out.println("Task2 Done!");

        for (int i = 301; i <= 399 ; i++) {
            System.out.printf("%s", i + ((399 != i) ? ", " : "\n"));
        }
        System.out.println("Task3 Done!");
    }
}
