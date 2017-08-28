package com.javaee.examples.java_8.java8_lambda;

/**
 * Created by krishna1bhat on 5/25/17.
 */
@FunctionalInterface
public interface InheritanceFunc extends MyFunctionalInterface{
    default void subMessage(){
        System.out.println("Sub class Functional interface default method");
    }
}
