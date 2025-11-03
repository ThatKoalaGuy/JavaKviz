/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.domenkoder.kviz;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author domen
 */
public class Stopwatch {

    static int secondsPassed = 0;
    static Timer timer;

    public static void start() {
        if (timer == null || !timer.isRunning()) {
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    secondsPassed++;
                }
            });
            timer.start();
        }
    }

    public static void stop() {
        if (timer != null) {
            timer.stop();
        }
    }

    public static void reset() {
        secondsPassed = 0;
    }

    public static int getSeconds() {
        return secondsPassed;
    }
}
