/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {
    public static void main(String[] args) {
        List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase() + "-" + s.length())
                .forEach(p -> System.out.printf("%s ", p));
        System.out.println();

        IntStream.range(1,11).map(e -> e*e).forEach(p -> System.out.printf("%d ", p));
        System.out.println();

        List<Integer> list = List.of(3,5,3,213,45,5,7);
        System.out.println(list);
        list.stream().sorted().forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();
        list.stream().distinct().forEach(integer -> System.out.printf("%d ", integer));
        System.out.println();
        list.stream().sorted().map(e -> e*e).forEach(e -> System.out.printf("%d ", e));

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
