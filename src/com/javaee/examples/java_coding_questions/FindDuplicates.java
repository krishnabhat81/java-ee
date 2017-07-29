package com.javaee.examples.java_coding_questions;

/**
 * Created by krishna1bhat on 7/29/17.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write Code To Filter Duplicate Elements From An Array And Print As A List?
public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // Form a list of numbers from 0-9.
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }

        // Insert a new set of numbers from 0-5.
        for (int i = 0; i < 5; i++) {
            list.add(String.valueOf(i));
        }

        System.out.println("Input list : " + list);
        System.out.println("\nFiltered duplicates : " + processList(list));
    }

    public static Set<String> processList(List<String> listContainingDuplicates) {
        final Set<String> resultSet = new HashSet<>();
        final Set<String> tempSet = new HashSet<>();
        for (String yourInt : listContainingDuplicates) {
            if (!tempSet.add(yourInt)) {
                resultSet.add(yourInt);
            }
        }
        return resultSet;
    }
}