package com.javaee.examples.java_annotations;

/**
 * Created by krishna1bhat on 6/26/17.
 */
public class AnnotationTest {

    public static void main(String[] args){
        new AnnotationTest().printMessage();

        //We use java reflection to parse Java Annotations...
        //refer this link for more detail: http://www.journaldev.com/721/java-annotations-example-tutorial

    }

    @MyAnnotation(revision = 2, date = "June 27, 2017", comments = "This is a method level custom annotation testing...")
    public static void printMessage(){
        System.out.println("Hey, I am Okey!");
    }
}
