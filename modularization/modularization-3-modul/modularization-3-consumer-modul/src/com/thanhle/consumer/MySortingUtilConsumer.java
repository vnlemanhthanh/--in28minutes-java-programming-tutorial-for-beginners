/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.thanhle.consumer;

import com.vnlemanhthanh.sorting.util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {

    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));
        logger.info(sorted.toString());
        logger.info("--------------------------------");

    }
}
