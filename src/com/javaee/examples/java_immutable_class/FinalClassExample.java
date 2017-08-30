package com.javaee.examples.java_immutable_class;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by krishna1bhat on 5/4/17.
 */

/*
* Immutable class is good for caching purpose and
* Inherently thread-safe
*/

/*
*1. Make the class as final so it can’t be extended. (or Make constructor private, public factory method)
*2. Make all fields final and private.
*3. Don’t provide setter methods for variables.
*4. Initialize all the fields via a constructor performing deep copy (Not Shallow Copy).
*5. Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference (mutable objects).
*/

//Immutable class example -- POJO
public final class FinalClassExample {
    private final int id;
    private final String name;
    private final HashMap<String, String> testMap;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //Accessor function for mutable objects
    public HashMap<String, String> getTestMap() {
        //return testMap; //do not return reference, return a copy
        return (HashMap<String, String>) testMap.clone();
    }

    //public setter method----
    public FinalClassExample setName(String name){
        return new FinalClassExample(this.id, name, this.getTestMap());
    }

    //Constructor with Deep Copy
    public FinalClassExample(int id, String name, HashMap<String, String> testMap){
        this.id = id;
        this.name = name;

        HashMap<String, String> tmpMap = new HashMap<>();
        String key;
        Iterator<String> iterator = testMap.keySet().iterator();
        while(iterator.hasNext()){
            key = iterator.next();
            tmpMap.put(key, testMap.get(key));
        }
        this.testMap = tmpMap;
    }

    //Constructor with shallow copy -- test this
//    public FinalClassExample(int id, String name, HashMap<String, String> testMap){
//        this.id = id;
//        this.name = name;
//        this.testMap = testMap;
//    }
}
