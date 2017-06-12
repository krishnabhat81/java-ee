package com.javaee.examples.java8_stream_api.filterMap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by krishna1bhat on 6/12/17.
 */
public class TestMapFilter {
    public static void main(String[] args){
        System.out.println("------- Java 8 – Filter a Map examples ------- \n");

        class User{
            private String name;
            User(String name){
                this.name = name;
            }
            String getName(){
                return this.name;
            }
        }

        Map<String, User> map = new HashMap<>();
        map.put("U1", new User("Krishna"));
        map.put("U2", new User("Amar"));
        map.put("U3", new User("Krishna"));
        map.put("U4", new User("Ram"));

        System.out.println("------- Before java8 ------- \n");

        for(Map.Entry<String, User> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().getName());
        }

        System.out.println("------- Java8 ------- \n");
        //Map -> Stream -> Filter -> String

        String result = map.entrySet().stream()
                .parallel()//parallelStream()
                .filter(m -> "Krishna".equals(m.getValue().getName()))
                .sequential()//stram()
                .map(m -> m.getValue().getName().toUpperCase())
                .collect(Collectors.joining(", ", "Prefix: ", " :Postfix"));
                //.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);

        //Reduce example...
        String[] myArray = { "this", "is", "a", "sentence" };
        String result123 = Arrays.stream(myArray)
                .reduce("", (a,b) -> a + b);


    }
}
