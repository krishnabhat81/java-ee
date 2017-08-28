package com.javaee.examples.java_8.method_references;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krishna1bhat on 8/28/17.
 */

/*
Method References help to point methods by their names,
Method reference is described using ::(double colon) symbol
1. static methods
2. instance methods
3. constructor with new operator
 */
public class MethodReferenceExample {
    public void instaceMethod(){
        System.out.println("Instance method running...");
    }

    public static void main(String... args){
        MethodReferenceExample myObj = new MethodReferenceExample();

        //2. instance methods
        PrintAnyMessage myMessage = myObj::instaceMethod;
        myMessage.printMsg();

        //3. constructor with new operator
        CheckConstructor me = MethodReferenceExample::new;
        me.checkMe();
    }

    MethodReferenceExample(){
        List<String> list = new ArrayList<>();
        list.add("D");
        list.add("A");
        list.add("C");
        list.add("B");

        //1. static methods
        list.forEach(System.out::println);
    }
}
