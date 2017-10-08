package com.github.xudong.leetcode.stack.validparentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            switch (c){
                case '(' :
                    stack.push(')');
                    break;
                case '{' :
                    stack.push('}');
                    break;
                case '[' :
                    stack.push(']');
                    break;
                default:
                    if(stack.empty() || stack.pop() != c){
                        return false;
                    }
            }
        }
        return stack.empty();
    }
}