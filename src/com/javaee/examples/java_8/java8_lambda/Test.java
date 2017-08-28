package com.javaee.examples.java_8.java8_lambda;

/**
 * Created by krishna1bhat on 5/24/17.
 */
public class Test {
    public static void main(String[] args){
        MyClass myClass = new MyClass();
        MyFunctionalInterface myFunctionalInterface;
        boolean result;

        int num = 7;//123

        myFunctionalInterface = myClass.is_odd();
        result = myClass.checker(myFunctionalInterface, num);

        if(result)
            System.out.println("Number is odd");

        myFunctionalInterface = myClass.is_Prime();
        result = myClass.checker(myFunctionalInterface, num);

        if(result)
            System.out.println("Number is prime");

        myFunctionalInterface = myClass.is_palindrome();
        result = myClass.checker(myFunctionalInterface, num);

        if(result)
            System.out.println("Number is palindrome");
    }
}
