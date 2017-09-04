package com.javaee.examples.java_multithreading_concurrency.sychronized_keyword;

/**
 * Created by krishna1bhat on 9/3/17.
 */
public class BeforeSynchronizedKeyword {
    private int count = 0;
    public static void main(String... args){
        BeforeSynchronizedKeyword app = new BeforeSynchronizedKeyword();
        app.doWork();
    }

    public void doWork(){
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                count++;
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                count++;
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
