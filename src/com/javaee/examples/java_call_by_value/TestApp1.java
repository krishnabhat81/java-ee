package com.javaee.examples.java_call_by_value;

/**
 * Created by krishna1bhat on 8/30/17.
 */
public class TestApp1 {
    public static void main( String[] args ) {
        Dog aDog = new Dog("Max");
        foo(aDog);
        // when foo(...) returns, the name of the dog has been changed to "Fifi"
        System.out.println(aDog.getName().equals("Fifi")); // true
    }

    public static void foo(Dog d) {
        System.out.println(d.getName().equals("Max")); // true
        // this changes the name of d to be "Fifi"
        d.setName("Fifi");
    }
}
