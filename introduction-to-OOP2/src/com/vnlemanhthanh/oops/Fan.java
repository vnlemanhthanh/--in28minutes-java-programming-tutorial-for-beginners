/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops;

public class Fan {
    private String make;
    private double radius;
    private String color;

    private boolean isOn;
    private byte speed;  //1 to 5

    public Fan(String make, double radius, String color) {
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn() {
        this.isOn = true;
        setSpeed((byte) 5);
    }

    public void switchOff() {
        this.isOn = false;
        setSpeed((byte) 0);
    }

    public void setSpeed(byte speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Fan{" + "make='" + make + '\'' + ", radius=" + radius + ", color='" + color + '\'' + ", isOn=" + isOn + ", speed=" + speed + '}';
    }


}
