package com.javaee.examples.java_algorithms_practices.java_stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by krishna1bhat on 8/26/17.
 */
public class StackByOneQueue {
    public static void main(String... args){
        //Testing... MyStack

    }
}


class MyStack<T>{
    Queue<T> nodes;

    MyStack(){
        nodes = new LinkedList<>();
    }

    T push(T node){
        int size = size();

        nodes.add(node);

        //Dequeue all previous elements and put them after current element on same queue
        for(int i = 0; i < size; i++){
            T n = nodes.remove();
            nodes.add(n);
        }

        return node;
    }

    T pop(){
        if(nodes.isEmpty()){
            System.out.println("Empty stack.");
            return null;
        }
        return  nodes.remove();
    }

    T peek(){
        if(nodes.isEmpty()){
            return null;
        }
        return nodes.peek();
    }

    int size(){
        return nodes.size();
    }

    boolean isEmpty(){
        return nodes.isEmpty();
    }

}
