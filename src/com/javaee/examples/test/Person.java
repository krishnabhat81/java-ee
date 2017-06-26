package com.javaee.examples.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by krishna1bhat on 6/19/17.
 */
public class Person implements Comparable<Person> {
    private String fName;
    private String lName;

    Person(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public int compareTo(Person o) {
        return (o.fName+o.lName).compareTo(fName+lName);
//        return Comparator.comparing(Person::getfName)
//                .thenComparing(Person::getlName)
//                .compare(this, o);
    }

    @Override
    public String toString() {
        return "Person{" + "fName='" + fName + '\'' + ", lName='" + lName + '\'' + '}';
    }

    public String getfName() {
        int a= 10/0;
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
