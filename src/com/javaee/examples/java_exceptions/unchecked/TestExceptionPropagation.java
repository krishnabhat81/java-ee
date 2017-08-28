package com.javaee.examples.java_exceptions.unchecked;

/**
 * Created by krishna1bhat on 7/29/17.
 */

//By default Unchecked Exceptions are forwarded in calling chain (propagated).

//not checked at compile time and will throw exception at runtime
class TestExceptionPropagation {
    void m(){
        int data=50/0;
    }
    void o(){
        m();
    }
    void n(){
        o();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled: " + e.getMessage());}
    }
    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}