package com.javaee.examples.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * Created by krishna1bhat on 5/13/17.
 */
//Java Priority Queue implementation provides O(log(n)) time for enqueing and dequeing method.

public class PriorityQueueExample {
    //Comparator anonymous class implementation
    public static Comparator<Customer> idComparator = new Comparator<Customer>(){

        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());
        }
    };

    //or 1.8
    public static Comparator<Customer> nameComparator1 = (Customer c1, Customer c2) -> c1.getName().compareTo(c2.getName());

    //or
    public static Comparator<Customer> nameComparator2 = Comparator.comparing(Customer::getName);

    public static void main(String[] args) {

        //natural ordering example of priority queue
        Queue<Integer> integerPriorityQueue = new PriorityQueue<>(7);
        Random rand = new Random();
        for(int i=0;i<7;i++){
            integerPriorityQueue.add(new Integer(rand.nextInt(100)));
        }
        for(int i=0;i<7;i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Processing Integer:"+in);
        }

        //PriorityQueue example with Comparator
        Queue<Customer> customerPriorityQueue = new PriorityQueue<>(7, idComparator);
        addDataToQueue(customerPriorityQueue);

        pollDataFromQueue(customerPriorityQueue);

    }

    //utility method to add random data to Queue
    private static void addDataToQueue(Queue<Customer> customerPriorityQueue) {
        Random rand = new Random();
        for(int i=0; i<7; i++){
            int id = rand.nextInt(100);
            customerPriorityQueue.add(new Customer(id, "Krishna "+id));
        }
    }

    //utility method to poll data from queue
    private static void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
        while(true){
            Customer cust = customerPriorityQueue.poll();
            if(cust == null) break;
            System.out.println("Processing Customer with ID="+cust.getId());
        }
    }
}
