package com.javaee.examples.java_algorithms_practices.java_coding_questions;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class CheckPrime {
    public static void main(String[] args){
        int n = 5;

        System.out.println("Number " + n + " is " + (checkPrime(n) ? "" : "not") + " a prime.");
    }

    public static boolean checkPrime(int n){
        if(n <= 1) return false;

        for (int i = 2; i < Math.sqrt(5); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
