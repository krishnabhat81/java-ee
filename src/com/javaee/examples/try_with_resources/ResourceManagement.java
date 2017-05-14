package com.javaee.examples.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by krishna1bhat on 5/13/17.
 */

//From Java 7, we can create resources inside try block and use it.
// Java takes care of closing it as soon as try-catch block gets finished.
// No need to write cleanup in finally block
public class ResourceManagement {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(
                "C:\\testing\\test.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//Benefits:

//    More readable code and easy to write.
//    Automatic resource management.
//    Number of lines of code is reduced.
//    No need of finally block just to close the resources.
//    We can open multiple resources in try-with-resources statement separated by a semicolon.
//    When multiple resources are opened in try-with-resources, it closes them in the reverse order to avoid any dependency issue. You can extend my resource program to prove that.