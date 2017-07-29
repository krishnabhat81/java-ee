package com.javaee.examples.java_coding_questions;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class ReverseNumber {
    public static void main(String[] args){
        int number = 12345;
        int revNumber = 0;

        while(number != 0){
            revNumber = (revNumber * 10) + (number % 10);

            number = number / 10;
        }

        System.out.println(revNumber);
    }
}
