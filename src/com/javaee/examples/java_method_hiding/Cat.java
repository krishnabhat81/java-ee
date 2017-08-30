package com.javaee.examples.java_method_hiding;

/**
 * Created by krishna1bhat on 8/29/17.
 */
public class Cat extends Animal {
    private String name;
    private int age;

    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    //subclass static method hides superclass static method...
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.testClassMethod();
        myCat.testInstanceMethod();

        System.out.println("\n--------------\n");

        Animal myAnimal = myCat;// or = new Cat();
        myAnimal.testClassMethod();
        myAnimal.testInstanceMethod();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Cat cat = (Cat) super.clone();

        return cat;
    }
}
