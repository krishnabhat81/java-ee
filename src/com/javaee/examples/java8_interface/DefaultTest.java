package com.javaee.examples.java8_interface;

/**
 * Created by krishna1bhat on 5/13/17.
 */
public class DefaultTest implements Interface1, Interface2 {
    @Override
    public void msg1(String str) {

    }

    @Override
    public void msg2(String str) {

    }

    //Diamond Problem -- compile time error
    //We have implement log() method -- both interfaces have same default method i.e. log()
    @Override
    public void log(String str) {

    }

    //@Override --  we can not override -- compiler error
    static void checkMe(){
        System.out.println("Static method in Impl class checkMe()");
    }
}
