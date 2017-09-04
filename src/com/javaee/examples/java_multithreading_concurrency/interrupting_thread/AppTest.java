package com.javaee.examples.java_multithreading_concurrency.interrupting_thread;

import java.util.Random;

/**
 * Created by krishna1bhat on 9/4/17.
 */
public class AppTest {
    public static void main(String... args) throws InterruptedException {
        System.out.println("Starting...");
        Thread t1 = new Thread(()->{
            Random random = new Random();
            for(int i = 0; i < 1E8; i++){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Interrupted...");
                    break;
                }
                Math.sin(random.nextDouble());
            }
        });

        t1.start();

        //After 500 millisecond, I want interrupt thread t1 and it breaks loop and finished t1 automatically.
        Thread.sleep(500);
        t1.interrupt();

        t1.join();
        System.out.println("Finished...");
    }
}
