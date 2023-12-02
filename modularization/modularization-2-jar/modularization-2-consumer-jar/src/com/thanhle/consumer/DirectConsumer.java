/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.thanhle.consumer;

import com.vnlemanhthanh.sorting.algorithm.BubbleSort;

import java.util.List;
import java.util.logging.Logger;

public class DirectConsumer {
    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        BubbleSort util = new BubbleSort();
        List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
        logger.info(sorted.toString());
        logger.info("--------------------------------");

    }
}
