/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {
    public static void print(Integer number) {
        System.out.println(number);
    }
    public static void main(String[] args) {
        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(String::length)
                .forEach(MethodReferencesRunner::print);

        List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> MethodReferencesRunner.print(s));


    }
}
