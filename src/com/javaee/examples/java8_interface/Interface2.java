package com.javaee.examples.java8_interface;

/**
 * Created by krishna1bhat on 5/13/17.
 */
public interface Interface2 {
    void msg2(String str);
    default void log(String str){
        System.out.println("Interface2 default log()");
    }
}
