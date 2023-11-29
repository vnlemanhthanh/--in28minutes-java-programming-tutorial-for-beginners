/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private final String name;
    private final ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks) {
        this.name = name;
        for (int mark : marks) {
            this.marks.add(mark);
        }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {
        return Collections.max(marks);
    }

    public int getMinimumMark() {
        return Collections.min(marks);
    }


    public BigDecimal getAverageMark() {
        int sum = getMaximumMark();
        int num = getNumberOfMarks();
        return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.HALF_UP);
    }

    public String toString() {
        return name + marks;
    }


    public void removeMarkAtIndex(int i) {
        marks.remove(i);
    }

    public void addNewMark(int mark) {
        marks.add(mark);
    }
}
