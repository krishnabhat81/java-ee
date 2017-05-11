package com.javaee.examples.string;

/**
 * Created by krishna1bhat on 5/11/17.
 */
//Java String implements Comparable interface, it has compareTo() and compareToIgnoreCase() methods to compare tqo strings
public class StringCompareTo {
    public static void main(String[] args) {
        String str = "KRISHNA";
        System.out.println(str.compareTo("BHAT"));
        System.out.println(str.compareToIgnoreCase("krishna"));
        //9 -- compares the character values  'K'-'B' = 9
        //0
    }
}
