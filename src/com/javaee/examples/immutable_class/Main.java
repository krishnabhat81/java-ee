package com.javaee.examples.immutable_class;

import java.lang.reflect.Field;
import java.util.HashMap;

/**
 * Created by krishna1bhat on 5/4/17.
 */
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("1", "Krishna");
        hash.put("2", "John");

        String str = "Original string";
        int i = 100;

        FinalClassExample example = new FinalClassExample(i, str, hash);

        //checking example object...
        System.out.println(str == example.getName());
        System.out.println(hash == example.getTestMap());

        //print the example values
        System.out.println("example id:" + example.getId());
        System.out.println("example name:" + example.getName());
        System.out.println("example testMap:" + example.getTestMap());

        //change the local variable values
        i = 200;
        str = "Modified string";
        hash.put("3", "Romeo");

        example.getTestMap().put("10", "This is test");

        //print the values again
        System.out.println("after change example id:" + example.getId());
        System.out.println("after change example name:" + example.getName());
        System.out.println("after change example testMap:" + example.getTestMap());

        HashMap<String, String> hmTest = example.getTestMap();
        hmTest.put("4", "new");

        System.out.println("after changing testMap from accessor methods:" + example.getTestMap());



        System.out.println("\n --------------- Reflection ;( ------------ \n");

        Class ref = example.getClass();
        Field fieldName = ref.getDeclaredField("name");

        fieldName.setAccessible(true);
        fieldName.set(example, "Hacked Name");

        System.out.println("example name after reflection hack: " + example.getName());

    }
}
