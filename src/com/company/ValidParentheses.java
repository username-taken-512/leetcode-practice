package com.company;

/*
https://leetcode.com/problems/valid-parentheses/

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else if (c == ')') {
                if (stack.peek() != '(') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == ']') {
                if (stack.peek() != '[') {
                    return false;
                } else {
                    stack.pop();
                }
            } else if (c == '}') {
                if (stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }

    /*
    Runtime: 2 ms, faster than 86.33% of Java online submissions for Valid Parentheses.
    Memory Usage: 42.1 MB, less than 46.29% of Java online submissions for Valid Parentheses.
     */

    public boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 == 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    stack.push(')');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if (stack.isEmpty() || stack.pop() != c) {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }

    /*
    Enhanced for loop:
    Runtime: 3 ms, faster than 52.48% of Java online submissions for Valid Parentheses.
    Memory Usage: 42 MB, less than 46.29% of Java online submissions for Valid Parentheses.

    Normal for loop:
    Runtime: 1 ms, faster than 99.57% of Java online submissions for Valid Parentheses.
    Memory Usage: 40.4 MB, less than 86.38% of Java online submissions for Valid Parentheses.
     */

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();

        System.out.println(validParentheses.isValid2("()[]{}"));
    }
}
