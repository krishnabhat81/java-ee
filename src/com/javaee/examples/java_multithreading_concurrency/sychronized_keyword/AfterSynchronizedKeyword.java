package com.javaee.examples.java_multithreading_concurrency.sychronized_keyword;

/**
 * Created by krishna1bhat on 9/3/17.
 */
public class AfterSynchronizedKeyword {
    private int count = 0;
    public static void main(String... args){
        AfterSynchronizedKeyword app = new AfterSynchronizedKeyword();
        app.doWork();
    }

    //look the synchronized method here...
    //will guarantee that the count++ will be executed by only one thread at a time
    public synchronized void increment(){
        count++;
    }

    public void doWork(){
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Run and check the result multiple times; will be vary...
        //goto next class and look the power of synchronized keyword (AfterSynchronizedKeyword.class)
        System.out.println("Count = " + count);
    }
}
