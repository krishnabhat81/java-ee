package com.javaee.examples.java_algorithms_practices;

import java.util.Arrays;

/**
 * Created by krishna1bhat on 8/26/17.
 */
public class ReverseStringRecursion {
    public static void main(String... args){
        String str = "hello";
        System.out.println("Original String: " + str);
        System.out.println("Original String: " + reverse(str));
    }

    private static String reverse(String str) {
        if(str == null || str.length() == 1)
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }
}