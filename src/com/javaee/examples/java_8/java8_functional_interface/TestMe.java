package com.javaee.examples.java_8.java8_functional_interface;

/**
 * Created by krishna1bhat on 5/13/17.
 */
public class TestMe {
    public static void main(String[] args){
        //Lambda Expression are the way through which we can visualize
        // functional programming in the java object oriented world.
        MyFunctionalInterface myFunctionalInterface = () -> System.out.print("This is my functional interface test");
        myFunctionalInterface.myMethod();
    }
}