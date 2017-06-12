package com.javaee.examples.java8_lambda;

/**
 * Created by krishna1bhat on 5/24/17.
 */
@FunctionalInterface
public interface MyFunctionalInterface {
    boolean check(int n);

    default void myMethod(){
        System.out.println("Functional interface default method");
    }
    static void printMessage(){
        System.out.println("Functional interface static method");
    }
}
