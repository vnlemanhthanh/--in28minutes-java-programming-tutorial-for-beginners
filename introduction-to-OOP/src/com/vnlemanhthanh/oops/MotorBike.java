/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class MotorBike {

    //state
    private int speed;

    //behaviour
    //method
    //inputs - int speed
    //outputs - void
    //name - setSpeed
    void setSpeed(int speed) { /*local variable*/
        this.speed = speed;
        //System.out.println(this.speed);
    }

    void start() {
        System.out.println("Motor Bike");
    }
}
