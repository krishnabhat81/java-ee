package com.javaee.examples.java_algorithms_practices.java_stack_implementation;

import java.util.Stack;

/**
 * Created by krishna1bhat on 8/25/17.
 */
public class CheckBracketBalance {
    public static void main(String... args){
        System.out.print(checkB());
    }

    private static boolean checkB(){
        Character[] str = {'(', '(', '(', ')', ')', ')', '(', '[', ']', ')'};

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length; i++){
            if(str[i] == '(' || str[i] == '{' || str[i] == '['){
                stack.push(str[i]);
            }
            if(str[i] == ')' || str[i] == '}' || str[i] == ']'){
                if(stack.isEmpty() || !isMatchingPair(stack.pop(), str[i])) {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }

    static boolean isMatchingPair(char character1, char character2)
    {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }
}
