package com.test.app;

import com.test.app.java.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hi");

        WarmupOne one = new WarmupOne();
        boolean weekday, vacation;

        one.sleepIn(true, false);
        System.out.println(one.sleepIn(true, false));


    }
}