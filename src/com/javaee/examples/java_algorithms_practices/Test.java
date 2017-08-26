package com.javaee.examples.java_algorithms_practices;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krishna1bhat on 8/26/17.
 */
public class Test {
    public static void main(String... args){
        System.out.println("Given two unsorted sets of integers, find the complement of the intersection of the two sets.");

        int[] a = {1,11,2,4,7,3};
        int[] b = {7,2,5,9,11};

        //yo question kasari garne ta?
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
        }

        for(int i = 0; i < b.length; i++){
            if(set.contains(b[i])){
                set.remove(b[i]);
            }else{
                set.add(b[i]);
            }
        }

        System.out.println(set);

    }
}
