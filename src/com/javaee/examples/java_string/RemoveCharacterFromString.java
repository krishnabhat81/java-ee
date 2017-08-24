package com.javaee.examples.java_string;

/**
 * Created by krishna1bhat on 8/24/17.
 */
public class RemoveCharacterFromString {
    public static void main(String... args){
        System.out.println(removeChar("Krishna Bhat", 'a'));
    }

    private static String removeChar(String str, char c) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(c), "");
    }
}
