package com.javaee.examples.exceptions.checked;

/**
 * Created by krishna1bhat on 7/29/17.
 */

//By default, Checked Exceptions are not forwarded in calling chain (propagated).
//So, you need to wirte throws in method signature of method chain

//and must be handled either by throwing or using try catch in invoker method
public class TestExceptionPropagation {
    void m(){
        throw new java.io.IOException("device error");//checked exception
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation obj=new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}

//Solution: throws in method chain
/*

void m() throws  Exception{
    throw new java.io.IOException("device error");//checked exception
}
void n() throws Exception {
    m();
}


Note: Exception i.e, Instance must be of type Throwable or a subclass of Throwable.

*/
