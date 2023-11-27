/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        printBasic(list);
        // printWithFP(list);
        printWithFPWithFiltering(list);

        List<Integer> numbers = List.of(0,1,2,3,4,5,6);
        filterList(numbers);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at")) {
                System.out.println(string);
            }
        }
        System.out.println(">>>Done!\n");
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)
            );
    }

    private static void printWithFPWithFiltering(List<String> list) {
        list.stream()
                .filter(e -> e.endsWith("at"))
                .forEach(element -> System.out.println("element - " + element));
    }

    private static List filterList(List<Integer> list) {
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println("Even number: " +e));

        list.stream()
                .filter(e -> e % 2 == 1)
                .forEach(e -> System.out.println("Odd number: " + e));

        System.out.println(list);
        return list;
    }
}
