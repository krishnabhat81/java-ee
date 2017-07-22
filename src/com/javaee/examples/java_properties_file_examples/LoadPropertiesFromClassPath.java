package com.javaee.examples.java_properties_file_examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by krishna1bhat on 7/21/17.
 */

/*
files from classpath the root of "src/" folder...
src/ folder is compiled to build/classes/, so all you put in src/* goes to classes/* ...
*/

public class LoadPropertiesFromClassPath {
    public static void main(String[] args){
        Properties properties = new Properties();

        String fileName = "classpath_config.properties";
        try(InputStream inputStream = LoadPropertiesFromClassPath.class.getClassLoader().getResourceAsStream(fileName);){
            if(inputStream == null){
                System.out.println("File not found: " + fileName);
                return;
            }

            properties.load(inputStream);
            System.out.println(properties.getProperty("name"));
            System.out.println(properties.getProperty("age"));
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
