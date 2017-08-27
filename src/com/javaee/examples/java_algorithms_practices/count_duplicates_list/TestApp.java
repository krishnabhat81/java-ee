package com.javaee.examples.java_algorithms_practices.count_duplicates_list;

import java.util.*;

/**
 * Created by krishna1bhat on 7/21/17.
 */

/*
Count duplicate items from List in java ; source: https://www.mkyong.com/java/how-to-count-duplicated-items-in-java-list
 */
public class TestApp {
    public static void main(String[] args){
        List<String> myList = new ArrayList<>();
        myList.add("Krishna");
        myList.add("Bhat");
        myList.add("Ramesh");
        myList.add("Krishna");
        myList.add("Ramesh");
        myList.add("Krishna");
        myList.add("Manish");
        myList.add("Ashutosh");
        myList.add("Ashutosh");
        myList.add("Manish");
        myList.add("Ashutosh");

        System.out.println("\n--------- Example1: Count 'Krishna' with frequency: --------- ");
        System.out.println("krishna: " + Collections.frequency(myList, "Krishna"));

        System.out.println("\n--------- Example2: Count all unique with frequency: --------- ");
        Set<String> uniqueSet = new HashSet<>(myList);
        for(String str : uniqueSet){
            System.out.println(str + ": " + Collections.frequency(myList, str));
        }

        System.out.println("\n--------- Example3: Count all with Map: --------- ");
        Map<String, Integer> myMap = new HashMap<>();
        for(String str:myList){
            Integer count = myMap.get(str);
            myMap.put(str, (count == null) ? 1 : count + 1);
        }

        printMap(myMap);

        System.out.println("\n--------- Sorted Map--------- ");
        Map<String, Integer> treeMap = new TreeMap<String, Integer>(myMap);
        printMap(treeMap);

    }

    private static void printMap(Map<String, Integer> map){
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
