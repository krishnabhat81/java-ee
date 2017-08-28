package com.javaee.examples.java_exceptions.custom;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class CustomExceptionTest {
    public static void validate(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException("Age is not valid.");
        else
            System.out.println("You are: " + age);
    }

    //Option1: try removing this method try catch (just call validate(12); method) => you will get compile time error, because InvalidAgeException is checked exception
    //Option2: try removing this method try catch and change InvalidAgeException to extend from RuntimeException i.e. it becomes unchecked exception
    public static void main(String[] args){
        try {
            validate(12);
        } catch (InvalidAgeException e) {
            //e.printStackTrace();//works
            System.out.println("Exception Occured: " + e.getMessage());
        }
    }
}
