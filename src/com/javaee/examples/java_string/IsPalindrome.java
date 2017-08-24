package com.javaee.examples.java_string;

/**
 * Created by krishna1bhat on 8/24/17.
 */
public class IsPalindrome {
    public static void main(String... args){
        System.out.println(checkPalindrome("123321") ? "Yes":"No");
        System.out.println(checkPalindromeChar("123321") ? "Yes":"No");
    }

    private static boolean checkPalindrome(String str){
        if(str == null) return false;

        StringBuilder revString = new StringBuilder(str).reverse();
        return str.equals(revString.toString());
    }

    //without using any class

    private static boolean checkPalindromeChar(String str){
        if(str == null) return false;

        int len = str.length();
        for(int i = 0; i < str.length() / 2; i++){
            if(str.charAt(i) != str.charAt(len - i - 1)) return false;
        }

        return true;
    }
}
