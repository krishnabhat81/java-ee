package com.javaee.examples.java_method_hiding;

/**
 * Created by krishna1bhat on 8/29/17.
 */
public class Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Animal");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal");
    }
}
