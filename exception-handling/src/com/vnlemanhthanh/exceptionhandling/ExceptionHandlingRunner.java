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
            int[] i = {1,2};
            int number = i[3];
            String str = null;
            str.length();
            System.out.println("ExceptionHandlingRunner.method2 Ended");
        } catch (NullPointerException e) {
            System.out.println("Match NullPointerException");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Match ArrayIndexOutOfBoundsException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Match Exception");
            e.printStackTrace();
        }
    }
}
