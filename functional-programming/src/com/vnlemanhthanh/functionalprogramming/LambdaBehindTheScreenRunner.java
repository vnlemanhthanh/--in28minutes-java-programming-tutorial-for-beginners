/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}

public class LambdaBehindTheScreenRunner {
    public static void main(String[] args) {
        List.of(34,43,34,45,36,48).stream()
                .filter(new EvenNumberPredicate())
                .forEach(e -> System.out.println(e));

        System.out.println();

        List.of(23,43,34,45,36,48).stream()
                .filter(n -> n%2 == 0)
                .forEach(e -> System.out.println(e));

        // Stream<T> filter(Predicate<? super T> predicate);
        // boolean test(T t);

    }

}