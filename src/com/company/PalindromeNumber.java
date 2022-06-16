package com.company;

/*
https://leetcode.com/problems/palindrome-number/

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

 */

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        for (int i = 0; i < s.length(); i++) {
            int j = s.length() - 1 - i;
//            System.out.println("comparing: " + i + ":" + s.charAt(i) + " " + j + ":" + s.charAt(j));
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /*
    Result:
    Runtime: 10 ms, faster than 84.41% of Java online submissions for Palindrome Number.
    Memory Usage: 41.6 MB, less than 88.86% of Java online submissions for Palindrome Number.
     */

    // # NOT DONE
    public boolean isPalindromeInt(int x) {
        if (x < 0) {    // Never a palindrome when starting with a minus
            return false;
        }

        int[] xArr = new int[]{};
        int i = 0;
        int tempX = x;

        int div = 10;
        while (x / div > 0) {
            div *= 10;
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        System.out.println(palindromeNumber.isPalindromeInt(121));

//        int inputExample1 = 121;
//        System.out.println(palindromeNumber.isPalindrome(inputExample1));
//
//        int inputExample2 = -121;
//        System.out.println(palindromeNumber.isPalindrome(inputExample2));
//
//        int inputExample3 = 10;
//        System.out.println(palindromeNumber.isPalindrome(inputExample3));

    }
}
