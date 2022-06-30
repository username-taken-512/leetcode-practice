package com.company;

import java.util.Arrays;

/*
https://leetcode.com/problems/running-sum-of-1d-array/submissions/

Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

Example 2:
Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].

Example 3:
Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 */

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        return result;
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
    Memory Usage: 42.2 MB, less than 88.96% of Java online submissions for Running Sum of 1d Array.
     */

    public int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    /*
    Runtime: 0 ms, faster than 100.00% of Java online submissions for Running Sum of 1d Array.
    Memory Usage: 43.3 MB, less than 42.93% of Java online submissions for Running Sum of 1d Array.
     */

    public static void main(String[] args) {
        RunningSumof1dArray r = new RunningSumof1dArray();
        System.out.println(Arrays.toString(r.runningSum2(new int[]{1, 2, 3, 4})));
    }
}
