package com.javaee.examples.java_properties_file_examples;

import java.io.*;
import java.util.Properties;

/**
 * Created by krishna1bhat on 7/21/17.
 */

//Properties files are used to store project configuration data or, settings
public class WriteToPropertiesTest {
    public static void main(String[] args){

        Properties properties = new Properties();
        try(
                OutputStream outputStream = new FileOutputStream("web/config.properties");
        ){

            properties.setProperty("name", "Krishna");
            properties.setProperty("age", "27");
            properties.setProperty("name", "Krishna Bhat");//overrides

            // save properties to project root folder
            properties.store(outputStream, null);
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
