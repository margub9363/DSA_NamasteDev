package greedyAlgorithm;

import java.util.*;

/*
A company is planning to interview 2n people. Given the array costs where costs[i] = [aCosti, bCosti],
the cost of flying the ith person to city a is aCosti, and the cost of flying the ith person to city b is bCosti.

Return the minimum cost to fly every person to a city such that exactly n people arrive in each city.

Example 1:
Input: costs = [[10,20],[30,200],[400,50],[30,20]]

Output: 110

Explanation:

The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.
The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.

Example 2:
Input: costs = [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]

Output: 1859

Example 3:
Input: costs = [[515,563],[451,713],[537,709],[343,819],[855,779],[457,60],[650,359],[631,42]]

Output: 3086
*/
public class TwoCityScheduling {
    public static void main(String[] args) {
        /*
        //  [[259,770],[448,54],[926,667],[184,139],[840,118],[577,469]]
        int[][] input = new int[6][2];
        input[0][0] = 259;
        input[0][1] = 770;

        input[1][0] = 448;
        input[1][1] = 54;

        input[2][0] = 926;
        input[2][1] = 667;

        input[3][0] = 184;
        input[3][1] = 139;

        input[4][0] = 840;
        input[4][1] = 118;

        input[5][0] = 577;
        input[5][1] = 469;

         */

        int[][] input = new int[][] {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}};

        //
        process(input);
    }
    public static void process(int[][]costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o2[1]-o2[0])-(o1[1]-o1[0]);
            }
        });
        int n = costs.length/2;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans + costs[i][0];
        }
        for (int i = n; i < costs.length; i++) {
            ans = ans + costs[i][1];
        }

        System.out.println("Answer is : " + ans);
    }

}
