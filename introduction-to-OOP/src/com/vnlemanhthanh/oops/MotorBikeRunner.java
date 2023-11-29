/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {

        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(new MotorBike().getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(100);

        ducati.increaseSpeed(-200);
        honda.increaseSpeed(-100);

        ducati.decreaseSpeed(50);
        honda.decreaseSpeed(50);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }
}
