package com.javaee.examples.java_exceptions.custom;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}