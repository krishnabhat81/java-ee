package com.javaee.examples.thread_communication;

import java.util.Scanner;

/**
 * Created by krishna1bhat on 7/5/17.
 */
public class ThreadExample {
    public static class ProducerAndConsumer{
        public void producer() throws InterruptedException{
            synchronized (this){
                System.out.println("Producer thread is running...");
                wait();
                System.out.println("Producer thread is resumed...");
            }
        }

        public void consumer() throws InterruptedException{
            Thread.sleep(1000);
            Scanner sc = new Scanner(System.in);

            synchronized (this){
                System.out.println("Waiting for return key.");
                sc.nextLine();
                System.out.println("Return key pressed.");

                notify();//comment this line -- t1 will wait infinitely -- deadlock
                System.out.println("Notified to thread 1 -- producer");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final ProducerAndConsumer pc = new ProducerAndConsumer();

        Thread t1 = new Thread(() -> {
            try {
                pc.consumer();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                pc.producer();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}
