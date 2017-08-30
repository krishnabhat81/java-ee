package com.javaee.examples.java_call_by_value;

/**
 * Created by krishna1bhat on 8/30/17.
 */
public class Dog {
    private String name;
    Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
