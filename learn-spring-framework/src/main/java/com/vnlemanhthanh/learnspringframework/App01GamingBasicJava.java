/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.learnspringframework;

import com.vnlemanhthanh.learnspringframework.game.GameRunner;
import com.vnlemanhthanh.learnspringframework.game.PacmanGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
