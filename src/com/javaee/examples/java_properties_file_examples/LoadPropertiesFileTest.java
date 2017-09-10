package com.javaee.examples.java_properties_file_examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by krishna1bhat on 7/21/17.
 */
public class LoadPropertiesFileTest {
    public static void main(String[] args){
        Properties properties = new Properties();

        try(InputStream inputStream = new FileInputStream("web/config.properties")){
            properties.load(inputStream);

            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("age"));

        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
