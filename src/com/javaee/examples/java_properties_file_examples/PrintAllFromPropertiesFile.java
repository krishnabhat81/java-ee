package com.javaee.examples.java_properties_file_examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by krishna1bhat on 7/21/17.
 */
public class PrintAllFromPropertiesFile {
    public static void main(String[] args){
        Properties properties = new Properties();

        try(InputStream inputStream = new FileInputStream("web/config.properties");){
            properties.load(inputStream);

            Enumeration<?> all = properties.propertyNames();
            while(all.hasMoreElements()){
                String key = (String)all.nextElement();
                String value = properties.getProperty(key);

                System.out.println(key + " = " + value);
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
