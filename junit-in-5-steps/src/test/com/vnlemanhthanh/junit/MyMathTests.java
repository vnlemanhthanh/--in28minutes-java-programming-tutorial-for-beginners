/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.junit;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

public class MyMathTests {
    com.vnlemanhthanh.junit.MyMath myMath = new MyMath();

    @Test
    public void calculateSumTest() {
        assertEquals(6, myMath.calculateSum(new int[]{1, 2, 3}));
        assertEquals(0, myMath.calculateSum(new int[]{}));
    }
}
