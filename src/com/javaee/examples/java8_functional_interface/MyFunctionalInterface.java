package com.javaee.examples.java8_functional_interface;

/**
 * Created by krishna1bhat on 5/13/17.
 */
@FunctionalInterface //this annotation is optional
public interface MyFunctionalInterface {
    public abstract void myMethod(); //only one abstract method

    //If we use @FunctionalInterface, it avoids accidental addition of abstract methods
    //public abstract void myMethodTwo();
}

//NOTE::
//The major benefit of java 8 functional interfaces is that we can use
// lambda expressions to instantiate them and avoid using
// bulky anonymous class implementation.