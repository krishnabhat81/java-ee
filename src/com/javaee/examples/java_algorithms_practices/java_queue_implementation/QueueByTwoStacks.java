package com.javaee.examples.java_algorithms_practices.java_queue_implementation;

import java.util.*;

/**
 * Created by krishna1bhat on 8/26/17.
 */
public class QueueByTwoStacks {
    public static void main(String... args){
        //Testing...
        MyQueue<String> myQ = new MyQueue<>();
        myQ.enqueue("Krishna");
        myQ.enqueue("Bhat");
        System.out.println(myQ);

        System.out.println(myQ.dequeue());
        System.out.println(myQ);

        myQ.enqueue("Hello");
        System.out.println(myQ);

    }

    static class MyQueue<T>{
        Stack<T> stack1;
        Stack<T> stack2;

        MyQueue(){
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        T enqueue(T t){//if you want make enqueue costly; you can, but making dequeue is better
            stack1.push(t);
            return t;
        }

        T dequeue(){//dequeue is costly only if stack2 is empty..
            if(stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue Empty.");
                return null;
            }

            if(stack2.isEmpty()){
                while (!stack1.isEmpty()){
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }

        int size(){
            return stack1.size() + stack2.size();
        }

        boolean isEmpty(){
            if(stack1.isEmpty() && stack2.isEmpty())
                return true;
            return false;
        }

        public String toString(){//just for test
            String str = "";
            if(!stack1.isEmpty())
                str += stack1.toString();
            if(!stack2.isEmpty())
                str += stack2.toString();
            return str;
        }
    }

}
