package com.javaee.examples.java_algorithms_practices.java_stack_implementation;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krishna1bhat on 8/25/17.
 */
public class TwoElementsSumInArray {
    public static void main(String... args){
        int[] arr = {1,2,3,4,5};//{23, 12, 27, 15, 18, 7, 9, 10};
        findPair(arr, 7);
    }

    static void findPair(int[] arr, int sum){

        Integer[] pair = new Integer[2];

        Set<Integer> complements = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            if(complements.contains(arr[i])){
                pair[1] = arr[i];
                pair[0] = sum - pair[1];
                break;
            }else{
                complements.add(sum - arr[i]);
            }
        }

        System.out.println(pair[0] + " , " + pair[1]);

    }
}
