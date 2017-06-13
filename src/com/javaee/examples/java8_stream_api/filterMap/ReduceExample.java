package com.javaee.examples.java8_stream_api.filterMap;

import java.util.Arrays;

/**
 * Created by krishna1bhat on 6/12/17.
 */
public class ReduceExample {
    public static void main(String[] args){
        //Reduce example...
        String[] myArray = { "this", "is", "a", "sentence" };
        String result123 = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);
        System.out.println(result123);
    }
}
