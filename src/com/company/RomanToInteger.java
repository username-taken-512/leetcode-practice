package com.company;

/*
https://leetcode.com/problems/roman-to-integer/

Example 1:
Input: s = "III"
Output: 3
Explanation: III = 3.

Example 2:
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example 3:
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */

import java.util.HashMap;

public class RomanToInteger {
    HashMap<Character, Integer> romans = new HashMap<>();

    public RomanToInteger() {
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
    }


    public int romanToInt(String s) {
        int sum = 0;
        int i = s.length() - 1;
        char currentChar, prevChar = ' ';
        while (i >= 0) {
            currentChar = s.charAt(i);

            if (currentChar == 'I' && (prevChar == 'V' || prevChar == 'X')) {
                sum -= romans.get(currentChar);
            } else if (currentChar == 'X' && (prevChar == 'L' || prevChar == 'C')) {
                sum -= romans.get(currentChar);
            } else if (currentChar == 'C' && (prevChar == 'D' || prevChar == 'M')) {
                sum -= romans.get(currentChar);
            } else {
                sum += romans.get(currentChar);
            }

            i--;
            prevChar = currentChar;
        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();

        System.out.println(romanToInteger.romanToInt("MCMXCIV"));
    }
}
