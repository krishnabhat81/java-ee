package com.javaee.examples.java_iterator_vs_for;

/**
 * Created by krishna1bhat on 8/30/17.
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

//Performance check between ArrayList and LinkedList using iterator/for loops
public class Main {

    public static void main(String[] args) {
        //NOTE: try changing useArrayList to 'false' (using LinkedList) - Ohh no look time consumed by for loop (very very slower than ArrayList)
        boolean useArrayList = true;
        List<String> list = useArrayList ? new ArrayList<>() : new LinkedList<>();
        //list of 100000 random string
        for (int i = 0; i < 100000; i++) {
            list.add(UUID.randomUUID().toString());
        }

        //just for testing
        int sum = 0;

        //check Iterator
        long start = System.currentTimeMillis();
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String s = iter.next();
            sum += s.length();
        }
        System.out.println(System.currentTimeMillis() - start);

        //check advanced for loop (using iterator internally)
        start = System.currentTimeMillis();
        for (String s : list) {
            sum += s.length();
        }
        System.out.println(System.currentTimeMillis() - start);

        //check for loop
        start = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            sum += s.length();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
