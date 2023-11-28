/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.learnspringframework.game;

public class PacmanGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }
}
