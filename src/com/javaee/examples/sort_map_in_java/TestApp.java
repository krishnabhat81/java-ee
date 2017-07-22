package com.javaee.examples.sort_map_in_java;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by krishna1bhat on 7/22/17.
 */
public class TestApp {
    public static void main(String[] args){
        Map<Integer, String> unsortMap = new HashMap<>();
        unsortMap.put(10, "z");
        unsortMap.put(5, "b");
        unsortMap.put(6, "a");
        unsortMap.put(20, "c");
        unsortMap.put(1, "d");
        unsortMap.put(7, "e");
        unsortMap.put(8, "y");
        unsortMap.put(99, "n");
        unsortMap.put(50, "j");
        unsortMap.put(2, "m");
        unsortMap.put(9, "f");

        System.out.println("\n============ Sorted Map By Key by default ============");
        Map<Integer, String> sortedMap = new TreeMap<>(unsortMap);

        System.out.println(sortedMap);

        System.out.println("\n============ Sorted Map By Key using Comparator ============");
        Map<Integer, String> sortedMap1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        sortedMap1.putAll(unsortMap);

        System.out.println(sortedMap1);

        System.out.println("\n============ Sorted Map By Value ============");
        //refer http://www.mkyong.com/java/how-to-sort-a-map-in-java/


        System.out.println("\n============ Sorted Map By Using Java 8 ============");
        System.out.println("\n============ Sorted By Key ============");
        //By default, Collectors.toMap will returns a HashMap
        Map map = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal, //,mergeFunction - to handle collision
                        LinkedHashMap::new //need LinkedHashMap to keep the order
                ));

        System.out.println(map);

        System.out.println("\n============ Sorted By Value ============");
        Map map1 = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                //.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())
                //.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey, Map.Entry::getValue,
                        (oldVal, newVal) -> oldVal,
                        LinkedHashMap::new
                        ));
        System.out.println(map1);
    }
}
