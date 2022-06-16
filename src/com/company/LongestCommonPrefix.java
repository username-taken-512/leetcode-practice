package com.company;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/*
https://leetcode.com/problems/longest-common-prefix/

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        char currentChar;
        int prefixLength = 0;

        outerLoop:
        for (int i = 0; i < strs[0].length(); i++) {
            currentChar = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    break outerLoop;
                }

                if (strs[j].charAt(i) != currentChar) {
                    break outerLoop;
                }
            }
            prefixLength++;
        }

        return strs[0].substring(0, prefixLength);
    }

    /*
    Runtime: 1 ms, faster than 84.75% of Java online submissions for Longest Common Prefix.
    Memory Usage: 41.7 MB, less than 67.49% of Java online submissions for Longest Common Prefix.
     */

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        System.out.println("'flower','flow','flight': " + longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("'dog','racecar','car': " + longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
