/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");

    @Test
    void test() {
        boolean testTrue = todos.contains("AWS");
        boolean testFalse = todos.contains("GCP");
        assertTrue(testTrue);
        assertFalse(testFalse);
        assertEquals(3, todos.size(), "Error message");

        assertArrayEquals(new int[] {1, 2}, new int[] {2, 1});
    }
}
