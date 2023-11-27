/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Cat", "Dog");
        // printBasic(list);
        printWithFP(list);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
            );
    }
}
