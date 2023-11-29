/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {

        MotorBike ducati = new MotorBike();
        MotorBike honda = new MotorBike();

        ducati.start();
        honda.start();

        ducati.speed = 100;
        honda.speed = 80;

        ducati.speed = 20;
        honda.speed = 0;
    }
}
