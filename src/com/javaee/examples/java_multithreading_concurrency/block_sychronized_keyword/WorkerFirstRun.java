package com.javaee.examples.java_multithreading_concurrency.block_sychronized_keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by krishna1bhat on 9/4/17.
 */

// 1. first, run with only one thread t1, look size of list1 and list2
// 2. second, add another thread t2 also and look list1 and list2 size vary and some point exception also thrown
// 3. third, add synchronized on methods stageOne() and stageTwo(). and run - too slow, becoz method level synchronization is locking WorkerFirstRun class and if one thread run stageOne() another thread have to wait to run stageTwo() ..
// 4. fourth, look WorkerFinal class with synchronized block

public class WorkerFirstRun {
    private Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public synchronized void stageOne(){
        try{
            Thread.sleep(1);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        list1.add(random.nextInt());
    }

    public synchronized void stageTwo(){
        try{
            Thread.sleep(1);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

        list2.add(random.nextInt());
    }

    public void process(){
        for(int i = 0; i < 1000; i++){
            stageOne();
            stageTwo();
        }
    }

    public void main(){
        System.out.println("Program starting...");

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> process());//1. first run with only one thread t1, look size of list1 and list2
        Thread t2 = new Thread(() -> process());//2. after add second thread and look list1 and list2 size vary and some point exception also thrown

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println("Total time taken: " + (end - start) + " seconds.");
        System.out.println("List1: " + list1.size());
        System.out.println("List2: " + list2.size());
    }
}
