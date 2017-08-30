package com.javaee.examples.java_call_by_value;

/**
 * Created by krishna1bhat on 8/30/17.
 */
public class TestApp {
    public static void main(String... args){
        Dog aDog = new Dog("Max");
        // we pass the object to foo
        foo(aDog);
        // aDog variable is still pointing to the "Max" dog when foo(...) returns
        System.out.println(aDog.getName().equals("Max")); // true, java passes by value
        System.out.println(aDog.getName().equals("Fifi")); // false
    }

    public static void foo(Dog d) {
        System.out.println(d.getName().equals("Max")); // true
        // change d inside of foo() to point to a new Dog instance "Fifi"
        d = new Dog("Fifi");
        System.out.println(d.getName().equals("Fifi")); // true
    }
}
