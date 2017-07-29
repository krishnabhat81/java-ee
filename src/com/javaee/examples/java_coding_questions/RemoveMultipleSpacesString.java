package com.javaee.examples.java_coding_questions;

/**
 * Created by krishna1bhat on 7/29/17.
 */
//Write Java Code To Get Rid Of Multiple Spaces From A String?
public class RemoveMultipleSpacesString {
    public static void main(String[] args){
        String str = " hello     there   ";

        System.out.println(str.replaceAll("( +)"," ").trim());
        System.out.println(str.replaceAll("\\s{2,}"," ").trim());
    }
}
