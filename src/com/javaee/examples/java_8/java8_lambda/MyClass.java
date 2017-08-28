package com.javaee.examples.java_8.java8_lambda;

/**
 * Created by krishna1bhat on 5/24/17.
 */
public class MyClass {
    public static boolean checker(MyFunctionalInterface myFunctionalInterface, int n){
        return myFunctionalInterface.check(n);
    }

    public static MyFunctionalInterface is_odd(){
        return n -> n % 2 != 0;
    }

    public static MyFunctionalInterface is_Prime(){
        return n -> (new java.math.BigInteger(String.valueOf(n))).isProbablePrime(100);
    }

    public static MyFunctionalInterface is_palindrome(){
        return n -> String.valueOf(n).equals((new StringBuilder(String.valueOf(n))).reverse().toString());
    }
}
