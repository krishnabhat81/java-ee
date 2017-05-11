package com.javaee.examples.string;

/**
 * Created by krishna1bhat on 5/11/17.
 */

//How many String objects will be created in below code?
public class TrickyCheck {
    public static void main(String[] args){
        String s1 = new String("Krishna");
        String s2 = new String("Krishna");

        //Ans: 3
        //First, Krishna object created in String pool
        //Second, new String wih "Krishna" is created on heap memory
        //Third new String wih "Krishna" is created in heap memory
        //NOTE: "Krishna" string from string pool is used in s2 case...
    }
}
