/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domenkoder.kviz;

/**
 *
 * @author domen
 */
public class Score {

    static int score = 0;

    public static void reset() {
        score = 0;
    }

    public static void increment() {
        score++;
    }

    public static int getScore() {
        return score;
    }
}
