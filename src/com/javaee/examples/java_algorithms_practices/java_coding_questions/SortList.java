package com.javaee.examples.java_algorithms_practices.java_coding_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by krishna1bhat on 7/29/17.
 */
public class SortList {
    public static void main(String... args){
        String[] arr = {"Krishna", "Bhat", "Hello", "Hi", "Done", "Very good"};

        Arrays.sort(arr);

        for(String s: arr){
            System.out.println(s);
        }

        List<String> list = new ArrayList<>();
        list.add("Krishna");
        list.add("Bhat");
        list.add("Hello");
        list.add("Hi");
        list.add("Done");
        list.add("Very good");

        for(String s : list){
            System.out.println(s);
        }
    }
}
