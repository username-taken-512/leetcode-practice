package com.company.medium;


/*
https://leetcode.com/problems/reverse-integer/

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21

 */

public class ReverseInteger {
    public int reverse(int x) {
        int remain, temp = -1, result = 0;

        while (temp != 0) {
            // Integer.MAX_VALUE / 10, Integer.MIN_VALUE / 10
            if (result > 214748364 || result < -214748364) {
                return 0;
            }
            temp = x / 10;
            remain = x % 10;

            result = result * 10 + remain;

            x = temp;
        }
        return result;
    }

    /*
    Runtime: 2 ms, faster than 69.96% of Java online submissions for Reverse Integer.
    Memory Usage: 40.3 MB, less than 79.24% of Java online submissions for Reverse Integer.
     */

    public static void main(String[] args) {
        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(1534236469));
    }
}
