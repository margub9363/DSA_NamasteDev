package dynamicProgramming;

/*
You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
Once you pay the cost, you can either climb one or two steps.
You can either start from the step with index 0, or the step with index 1.
Return the minimum cost to reach the top of the floor.

Example 1:
Input: cost = [10,15,20]
Output: 15
Explanation: You will start at index 1. – Pay 15 and climb two steps to reach the top. The total cost is 15.

Example 2:
Input: cost = [1,100,1,1,1,100,1,1,100,1]
Output: 6
Explanation: You will start at index 0. – Pay 1 and climb two steps to reach index 2. – Pay 1 and
climb two steps to reach index 4. – Pay 1 and climb two steps to reach index 6. – Pay 1 and climb one
step to reach index 7. – Pay 1 and climb two steps to reach index 9. – Pay 1 and climb one step to reach
the top. The total cost is 6.
 */
public class MinimumCostClimbingStairs {
    public static void main(String[] args) {

//        int[] cost = new int[]{10, 15, 20};
        int[] cost = new int[]{1,100,1,1,1,100,1,1,100,1};
        int dp[] = new int[cost.length + 1];
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {
            dp[i] = getMinimum((dp[i - 2] + cost[i - 2]), dp[i - 1] + cost[i - 1]);
        }
        System.out.println("Minimum Cost in reaching Step(" + cost.length + ") is : " + dp[cost.length]);
    }

    private static int getMinimum(int input1, int input2) {
        if (input2 < input1) {
            return input2;
        } else return input1;
    }
}
