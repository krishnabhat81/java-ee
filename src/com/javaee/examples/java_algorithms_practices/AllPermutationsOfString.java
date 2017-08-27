package com.javaee.examples.java_algorithms_practices;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by krishna1bhat on 8/26/17.
 * Ref: http://www.journaldev.com/526/java-program-to-find-all-permutations-of-a-string
 */
public class AllPermutationsOfString {
    public static void main(String... args){
        String str = "ABC";

        Set<String> permutations = findUniquePermutations(str);
        System.out.println(permutations);
    }

    private static Set<String> findUniquePermutations(String str) {
        Set<String> mySet = new HashSet<>();

        //base case
        if(str == null) return null;
        if(str.length() == 0){
            mySet.add("");
            return mySet;
        }

        char initial = str.charAt(0);

        Set<String> words = findUniquePermutations(str.substring(1));

        for(String strNew : words){
            for (int i = 0; i <= strNew.length(); i++){
                mySet.add(insertChar(strNew, initial, i));
            }
        }

        return mySet;
    }

    private static String insertChar(String strNew, char ch, int i) {
        String begin = strNew.substring(0, i);
        String end = strNew.substring(i);
        return begin + ch + end;
    }
}
