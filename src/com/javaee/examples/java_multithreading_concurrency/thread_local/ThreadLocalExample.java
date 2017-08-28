package com.javaee.examples.java_multithreading_concurrency.thread_local;

import java.text.SimpleDateFormat;
import java.util.Random;

/**
 * Created by krishna1bhat on 8/27/17.
 */

// run and check the output; each thread has their own first/initialized value...
public class ThreadLocalExample implements Runnable {

    // SimpleDateFormat is not thread-safe, so give one to each thread
    // private static
    private static final ThreadLocal<SimpleDateFormat> formatter = new ThreadLocal<SimpleDateFormat>(){
        @Override
        protected SimpleDateFormat initialValue(){
            return new SimpleDateFormat("yyMMdd HHmm");
        }
    };

    // or use ThreadLocal.withInitial()...
    // private static final ThreadLocal<SimpleDateFormat> formatter = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyMMdd HHmm"););


    // Every thread has it’s own ThreadLocal variable and
    // they can use it’s get() and set() methods to get the default value or change it’s value local to Thread.
    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+formatter.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        formatter.set(new SimpleDateFormat());

        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+formatter.get().toPattern());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLocalExample obj = new ThreadLocalExample();
        for(int i=0 ; i<10; i++){
            Thread t = new Thread(obj, ""+i);
            Thread.sleep(new Random().nextInt(1000));
            t.start();
        }
    }
}
