package com.javaee.examples.java_algorithms_practices.java_coding_questions;

/**
 * Created by krishna1bhat on 7/29/17.
 */

//Write Java Code To Swap Two Numbers Without Using A Temporary Variable?
public class SwappingWithoutTempVar {
    public static void main(String... args){
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
