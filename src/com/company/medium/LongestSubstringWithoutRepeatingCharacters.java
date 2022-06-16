package com.company.medium;


/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int bestStart = 0, bestEnd = 0, currentStart = 0, currentEnd = 0;
        for (int i = 0; i < s.length(); i++) {

            String currentString = s.substring(currentStart, currentEnd);
            currentEnd = i + 1;
            String currentChar = s.substring(i, currentEnd);

            if (currentString.contains(currentChar)) {
                if (bestEnd - bestStart < currentEnd - currentStart) {

                    bestStart = currentStart;
                    bestEnd = currentEnd - 1;   // -1 to not use current char (which is double)
                }
                currentStart = currentString.indexOf(currentChar) + currentStart + 1;
            }
        }

        if (bestEnd - bestStart < currentEnd - currentStart) {
            bestStart = currentStart;
            bestEnd = currentEnd;
        }
        return bestEnd - bestStart;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("ggububgvfk"));
    }
}
