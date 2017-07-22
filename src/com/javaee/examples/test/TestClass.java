package com.javaee.examples.test;

import com.javaee.examples.Emp;
import com.javaee.examples.Manager;
import sun.net.www.protocol.http.HttpURLConnection;

import java.lang.reflect.Field;
import java.time.Period;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by krishna1bhat on 7/02/17.
 */
public class TestClass {

    static {
        int x = 0;
        System.out.println("dfsf");
    }

    public static void main(String[] args){

//        for(Byte b = Byte.MIN_VALUE; b<Byte.MAX_VALUE; b++){
//            System.out.printf(String.format("%02x \n\n", b));
//        }
//
//        System.out.println("0x90: "+0x90);

        final List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,5,2,3,7,3,8,9);
        final Integer pos = Integer.valueOf(3);
        list.remove(pos);
        System.out.println(list);

        Emp e = new Emp();
        //Manager m = e;//error -- incompatible task
        Emp nn = new Manager();
        Manager m = (Manager)e;



//        String[][] x = new String[1][];
//        x[0][0] = "Fred";
//        System.out.println(x[0][0]);
    }
}
