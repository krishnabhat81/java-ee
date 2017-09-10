package com.javaee.examples.java_final_vs_immutable;

/**
 * Created by krishna1bhat on 9/10/17.
 */
public class TestApp {
    //final variable
    private static final String finalVar = "Hello";

    //immutable variable
    private static String immutableVar = "Hello";

    public static void main(String... args){
        finalVar = "New Hello";//we can not change the object's reference to point to another reference
        immutableVar = "New Hello";//we change reference but can't change value -- compiler creates new String of 'New Hello'
        System.out.println("I am done -- final vs immutable in java");
    }
}
