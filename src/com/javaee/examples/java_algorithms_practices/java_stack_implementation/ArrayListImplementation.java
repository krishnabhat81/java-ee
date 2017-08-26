package com.javaee.examples.java_algorithms_practices.java_stack_implementation;

import java.util.*;

/**
 * Created by krishna1bhat on 8/25/17.
 */
public class ArrayListImplementation {
    public static void main(String... args){

        System.out.println("----------Stack Implementation: ArrayList-------");

        class MyStack<T> extends Stack<T> {

            private List<T> list;

            MyStack(){
                list = new ArrayList<>();
            }

            public T push(T a){
                list.add(a);
                return a;
            }

            public T pop(){
                if(list.size() > 0)
                    return list.remove(list.size()-1);
                else
                    return null;
                //else
                    //throw new Exception("Stack Empty");
            }

            public T peek(){
                return list.get(list.size()-1);
            }

            public int size(){
                return list.size();
            }

            public String toString(){
                return list.toString();
            }
        }

        MyStack<Integer> s = new MyStack<>();
        s.push(1);
        System.out.println(s);
        s.push(2);
        System.out.println(s);

        s.pop();
        System.out.println(s);
        s.push(5);
        System.out.println(s.peek());
        System.out.println(s);

        int[] pair = new int[2];


    }
}
