package com.company;
// https://leetcode.com/problems/two-sum/

/*
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int lookingFor = target - nums[i];
            if (map.get(lookingFor) != null) {
                return new int[]{i, map.get(lookingFor)};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        // Testing HashMap attempt
        int[] outMap = twoSum.twoSumMap(new int [] {1, 7, 11, 2}, 9);
        System.out.println(outMap[0] + ", " + outMap[1]);

        int[] outMap2 = twoSum.twoSumMap(new int [] {8, -2, 4}, 6);
        System.out.println(outMap2[0] + ", " + outMap2[1]);

        // Testing first attempt
        int[] out = twoSum.twoSum(new int [] {1, 7, 11, 2}, 9);
        System.out.println(out[0] + ", " + out[1]);

        int[] out2 = twoSum.twoSum(new int [] {3, 2, 4}, 6);
        System.out.println(out2[0] + ", " + out2[1]);

        int[] out3 = twoSum.twoSum(new int [] {3, 3}, 6);
        System.out.println(out3[0] + ", " + out3[1]);
    }
}

/*
First result:
Runtime: 89 ms, faster than 22.22% of Java online submissions for Two Sum.
Memory Usage: 42.3 MB, less than 90.05% of Java online submissions for Two Sum.

HashMap result:
Runtime: 6 ms, faster than 54.14% of Java online submissions for Two Sum.
Memory Usage: 46 MB, less than 20.07% of Java online submissions for Two Sum.
 */

