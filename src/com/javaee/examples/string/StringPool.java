package com.javaee.examples.string;

/**
 * Created by krishna1bhat on 5/11/17.
 */

//Strings are stored in Heap memory -- String is class....
public class StringPool {
    public static void main(String[] args){
        //Using double quote
        //First looks string with same value (Hello) in String pool
        //if found just returns its reference, otherwise creates new String in pool and then returns  its reference

        String s1 = "Hello";
        String s2 = "Hello";

        //Using new operator
        //Creates new string object in heap memory (Hello)
        String s3 = new String("Hello");

        System.out.println("s1 == s2 : " + (s1 == s2) );
        System.out.println("s2 == s3 : " + (s2 == s3) );

        //intern() method puts s3 to String pool
        s3.intern();
        System.out.println("After intern() without assigning to s3; s2 == s3 : " + (s2 == s3) );
        //false becoz, intern() return the String object reference from the string pool, but since we didn't assigned it back to s3

        s3 = s3.intern();
        System.out.println("After intern() and assigning to s3; s2 == s3 : " + (s2 == s3) );//true
    }
}
