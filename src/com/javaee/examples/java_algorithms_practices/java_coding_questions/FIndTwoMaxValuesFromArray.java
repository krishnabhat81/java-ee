package com.javaee.examples.java_algorithms_practices.java_coding_questions;

import java.util.Arrays;

/**
 * Created by krishna1bhat on 7/29/17.
 */
//Write A Java Program To Find Out The First Two Max Values From An Array?
public class FIndTwoMaxValuesFromArray {
    public static void main(String[] args){
        int[] numbers = {1,4,5,7,9,90,3,1,2,56,123,50,34,23,11};

        int max1 = 0;
        int max2 = 0;

        for(int n : numbers){
            if(n > max1) {
                max2 = max1;
                max1 = n;
            }
            else if(max2 < n){
                max2 = n;
            }
        }

        System.out.println("Max1 = " + max1 + ", Max2 = " + max2);

        Arrays.sort(numbers);
        System.out.println("Max1 = " + numbers[numbers.length-1] + ", Max2 = " + numbers[numbers.length-2]);
    }
}
