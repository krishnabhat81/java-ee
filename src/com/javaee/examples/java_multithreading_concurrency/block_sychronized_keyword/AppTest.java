package com.javaee.examples.java_multithreading_concurrency.block_sychronized_keyword;

/**
 * Created by krishna1bhat on 9/4/17.
 */
public class AppTest {
    public static void main(String... args){
        new WorkerFirstRun().main();
        //new WorkerFinal().main(); // check this for synchronized block - time taken is nearly 2 second and also list1 and list2 has all 2000 data
    }
}
