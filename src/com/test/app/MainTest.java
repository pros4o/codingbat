package com.test.app;

import com.test.app.java.*;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Hi");

        WarmupOne one = new WarmupOne();

        one.sleepIn(true, false);
        System.out.println(one.sleepIn(true, false));

        ArrayOne two = new ArrayOne();
        int[] nums = {1,2,3,4};
        System.out.println(two.double23(nums));
    }
}