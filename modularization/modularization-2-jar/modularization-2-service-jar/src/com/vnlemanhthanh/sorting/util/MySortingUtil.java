/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.sorting.util;

import com.vnlemanhthanh.sorting.algorithm.BubbleSort;

import java.util.List;

public class MySortingUtil {
    public List<String> sort(List<String> names) {
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(names);

    }
}
