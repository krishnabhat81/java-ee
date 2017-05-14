package com.javaee.examples.java8_interface;

/**
 * Created by krishna1bhat on 5/13/17.
 */
public interface Interface1 {
    void msg1(String str);

    //Java interface default methods are also referred to as Defender Methods or Virtual extension methods.
    default void log(String str){
        System.out.println("Interface1 default log()");
    }

    //We can’t override static methods in the implementation classes
    static void checkMe(){
        System.out.println("Interface static method checkMe()");
    }
}
