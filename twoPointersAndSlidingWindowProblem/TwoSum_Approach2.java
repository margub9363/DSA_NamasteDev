package twoPointersAndSlidingWindowProblem;

import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Examples:
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

* */
public class TwoSum_Approach2 {
    public static void main(String[] args) {
        /*int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;*/


        /*int[] nums = new int[]{3,2,4};
        int target = 6;*/

        int[] nums = new int[]{3,3};
        int target = 6;

        int[] ints = twoSum(nums, target);
        if (ints[0] == -1) {
            System.out.println("Not Found...");
        } else {
            System.out.println("Target("+ target + ") found at: " + ints[0] +" and " +ints[1]+ " positions");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int pairToFind = target - nums[i];
            if (map.containsKey(pairToFind) && map.get(pairToFind) != i) {
                return new int[] { i, map.get(pairToFind) };
            }
        }
        return new int[0];
    }

    /*private static int[] twoSum(int[] inputArray, int target) {
        Map<Integer, Integer> keyValueCount = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if(keyValueCount.containsKey(inputArray[i])) {
                keyValueCount.put(inputArray[i], keyValueCount.get(keyValueCount)+1);
            } else {
                keyValueCount.put(inputArray[i],1);
            }
        }

        keyValueCount.keySet().stream().map( i -> {
            if (keyValueCount.containsKey(target-i)){
                val
            }
        })

    }*/
}
