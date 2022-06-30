package com.company.medium;

import java.util.Arrays;

/*
https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/submissions/

Example 1:
Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

Example 2:
Input: nums = [1,10,2,9]
Output: 16
 */

public class MinimumMovestoEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int result = 0;

        for (int num : nums) {
            result += Math.abs(num - mid);
        }
        return result;
    }

    /*
    Runtime: 6 ms, faster than 45.85% of Java online submissions for Minimum Moves to Equal Array Elements II.
    Memory Usage: 46.6 MB, less than 6.72% of Java online submissions for Minimum Moves to Equal Array Elements II.
     */

    public static void main(String[] args) {
        MinimumMovestoEqualArrayElementsII m = new MinimumMovestoEqualArrayElementsII();
        System.out.println(m.minMoves2(new int[]{1,10,2,9}));
        System.out.println(m.minMoves2(new int[]{1, 2, 3}));
        System.out.println(m.minMoves2(new int[]{1,0,0,8,6}));
    }
}