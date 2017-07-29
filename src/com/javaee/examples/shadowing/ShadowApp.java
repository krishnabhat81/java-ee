package com.javaee.examples.shadowing;

/**
 * Created by krishna1bhat on 7/28/17.
 */
public class ShadowApp {
    static int x;
    public static void main(String[] args)
    {
        x = 5;
        System.out.println("x = " + x);//prints value of class variable
        int x;
        x = 10;
        System.out.println("x = " + x);//class variable x is shadowed by the local variable x
        System.out.println("ShadowApp.x = " + ShadowApp.x);//can print class variable by providing its fully qualified name
    }
}
