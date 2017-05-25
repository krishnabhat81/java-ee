package com.javaee.examples.java8_lambda;

/**
 * Created by krishna1bhat on 5/24/17.
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New thread is created and running...");
            }
        }).start();
    }
}