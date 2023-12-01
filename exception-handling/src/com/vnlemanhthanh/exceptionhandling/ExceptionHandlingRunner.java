/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.exceptionhandling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("ExceptionHandlingRunner.main Ended");
    }

    private static void method1() {
        method2();
        System.out.println("ExceptionHandlingRunner.method1 Ended");
    }

    private static void method2() {
        try {
            String str = null;
            str.length();
            System.out.println("ExceptionHandlingRunner.method2 Ended");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
