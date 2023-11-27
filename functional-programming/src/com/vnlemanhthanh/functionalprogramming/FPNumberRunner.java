/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,6,8,13,3,15);
        // numbers.stream().forEach(e -> System.out.println(e));

        int sum = numbers.stream()
                .filter(number -> number > 0 )
                .reduce(0, (num1, num2) -> {
                    // System.out.println(num1 + " - " + num2);
                    return num1 + num2;
                });
        System.out.println(sum);
    }

    private static int normalSum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers){
            sum += number;
        }
        return sum;
    }
}
