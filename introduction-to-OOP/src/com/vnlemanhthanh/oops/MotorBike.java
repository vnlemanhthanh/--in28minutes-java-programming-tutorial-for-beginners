/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class MotorBike {

    //state
    private int speed;

    public MotorBike() {
        this(5);
        System.out.println("Constructer called");
    }

    MotorBike(int speed) {
        this.speed = speed;
    }

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

    public void increaseSpeed(int howMuch) {
        setSpeed(this.speed + howMuch);
    }

    public void decreaseSpeed(int howMuch) {
        setSpeed(this.speed - howMuch);
    }
}
