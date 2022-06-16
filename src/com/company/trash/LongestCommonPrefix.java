package com.company.trash;

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
        HashMap<String, Integer> map = new HashMap<>();     // Prefix: Number of occurrences

        for (int i = 0; i < strs.length; i++) {
            for (int j = 1; j < strs[i].length(); j++) {
                String s = strs[i].substring(0, j);
                int currentVal = map.containsKey(s) ? map.get(s) : 0;
                System.out.println(s);
                map.put(s, currentVal > 0 ? currentVal + 1 : 1);
            }
        }

        AtomicReference<String> largestKey = new AtomicReference<>("");
        int largestValue = 1;
        map.forEach((k, v) -> {
            if (k.length() > largestKey.get().length() && v > largestValue) {
                largestKey.set(k);
            }
        });

        return largestKey.get();
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        System.out.println("result: " + longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println("\"dog\",\"racecar\",\"car\": " + longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }
}
