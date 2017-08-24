package com.javaee.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by krishna1bhat on 8/23/17.
 */
public class TestingApp {
    private String msg;
    private static String msg1;

    {
        msg = "BlockMessage";
        msg1 = "Static From Block";
        System.out.println("Block: "+msg);
    }
    static{
        msg1 = "Static From StaticBlock";
        System.out.println("Static: "+msg1);
    }
    TestingApp(){
        System.out.println("Constructor: "+msg1);
    }
    public static void main(String... args){
        TestingApp test = new TestingApp();
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try{
            System.out.println(5/0);
        }catch (Exception ex){
            System.out.println("Exception");
        }
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");

        List<String> list = new ArrayList<>();
        list.add("Krihsna");
        list.add("Bhat");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println("TT= "+s);
        }
        list.add("Test");

        System.out.println(list);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestingApp that = (TestingApp) o;

        return msg != null ? msg.equals(that.msg) : that.msg == null;
    }

    @Override
    public int hashCode() {
        return msg != null ? msg.hashCode() : 0;
    }
}
