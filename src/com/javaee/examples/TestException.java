package com.javaee.examples;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by krishna1bhat on 5/13/17.
 */
public class TestException {
    public static void main(String[] args) {
        try{
            bar();
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }

        foo();
    }

    public static void bar(){

    }

    public static void foo() throws RuntimeException{

    }
}
