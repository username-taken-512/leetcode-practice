package com.company.medium;

/*
https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/

Example 1:
Input: n = "32"
Output: 3
Explanation: 10 + 11 + 11 = 32

Example 2:
Input: n = "82734"
Output: 8

Example 3:
Input: n = "27346209830709182346"
Output: 9
 */

import java.util.Arrays;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        char[] arr = n.toCharArray();
        Arrays.sort(arr);

        return arr[arr.length - 1] - 48;
    }

    public int minPartitions2(String n) {
        char result = '0';

        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > result) {
                result =  n.charAt(i);
                if (result == '9') {
                    break;
                }
            }
        }
        return result - 48;
    }

    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers p = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        System.out.println(p.minPartitions("27346209830709182346"));
    }
}
