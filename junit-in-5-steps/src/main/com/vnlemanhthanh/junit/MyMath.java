/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.junit;

public class MyMath {

    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (var number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        return sum;
    }
}
