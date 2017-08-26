package com.javaee.examples.java_algorithms_practices.java_stack_implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by krishna1bhat on 8/26/17.
 */
public class StackByTwoQueue {
    public static void main(String... args){
        //Testing...
        MyNewStack<String> stack = new MyNewStack<>();
        stack.push("Krishna");
        stack.push("Bhat");
        System.out.println("S1: " + stack);

        System.out.println(stack.pop());
        System.out.println("S2: " + stack);

        stack.push("Hello");

        System.out.println("S3: " + stack);
    }
}

class MyNewStack<T>{

    Queue<T> q1 = new LinkedList<>();
    Queue<T> q2 = new LinkedList<>();

    MyNewStack(){
        //
    }

    T push(T t){//you can make push costly and pop O(1)
        if(!q1.isEmpty()){
            q1.add(t);
        }else{
            q2.add(t);
        }
        return t;
    }

    T pop(){//pop is costly
        T temp = null;
        if(!q1.isEmpty()){
            temp = moveNode(q1, q2);
        }else if(!q2.isEmpty()){
            temp = moveNode(q2, q1);
        }

        return temp;
    }

    T peek(){
        T temp = null;
        if(!q1.isEmpty()){
            temp = q1.remove();
        }else if(!q2.isEmpty()){
            temp = q2.remove();
        }

        return temp;
    }

    int size(){
        int size = 0;
        if(!q1.isEmpty()){
            size = q1.size();
        }else{
            size = q2.size();
        }

        return size;
    }

    T moveNode(Queue<T> q1, Queue<T> q2){
        T temp;
        //check error conditions...
        for(int i = 0; i < q1.size() - 1; i++){
            q2.add(q1.remove());
        }
        temp = q1.remove();

        return temp;
    }

    public String toString(){
        if(!q1.isEmpty()){
            return q1.toString();
        }
        return q2.toString();
    }

}