package com.javaee.examples.java_8.java8_stream_api_filterMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by krishna1bhat on 6/13/17.
 */
public class OptionalTest {
    public static void main(String[] args){
        /*
        filter(Predicate): Takes a predicate (java.util.function.Predicate) as an argument and returns a stream including all elements that match the given predicate
        distinct: Returns a stream with unique elements (according to the implementation of equals for a stream element)
        limit(n): Returns a stream that is no longer than the given size n
        skip(n): Returns a stream with the first n number of elements discarded
         */

        System.out.println("------------- Optional is a container class to represent the existence or absence of a value: ---------- \n");

        List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
        words.stream()
                .filter(word -> "JAVA".equals(word))
                .findAny()//returns Optional  --- findFirst()
                .ifPresent(System.out::println);

        //orElse
        Optional<String> opt = words.stream()
                .filter(word -> "Java".equals(word))
                .findAny();
        String s = opt.orElse("test");
        System.out.println("S = " + s);


        //Optional isPresent and ifPresent
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyGender = Optional.empty();

        if (gender.isPresent()) {
            System.out.println("Value available.");
        } else {
            System.out.println("Value not available.");
        }

        gender.ifPresent(g -> System.out.println("In gender Option, value available."));

        //condition failed, no output print
        emptyGender.ifPresent(g -> System.out.println("In emptyGender Option, value available."));
    }
}
