/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.arrays;

public class Student {
    private final String name;
    private final int[] marks;

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

}
