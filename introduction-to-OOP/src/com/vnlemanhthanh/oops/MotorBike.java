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
        if (speed > 0)
            this.speed = speed;
        //System.out.println(this.speed);
    }

    public int getSpeed() {
        return speed;
    }

    void start() {
        System.out.println("Bike started");
    }
}
