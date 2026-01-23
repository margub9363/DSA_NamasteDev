package twoPointersAndSlidingWindowProblem;

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
public class TwoSum_Approach1 {
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

    private static int[] twoSum(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
