/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.oops.basic;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("Manufacturer 1", .321, "GREEN");

        fan.switchOn();
        System.out.println(fan);

        fan.switchOff();
        System.out.println(fan);


    }

}
