package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

 */
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] input = new int[][]{{1, 3}, {2, 6}, {5, 9}, {10, 14}, {18, 22}};
        // int[][] input = new int[][]{{8, 10}, {1, 6}, {15, 18}};
        printArrays(input);
        int[][] merge = merge(input);
        printArrays(merge);
    }

    private static void printArrays(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + " - " + arr[i][1]);
        }
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        ans.add(new int[]{intervals[0][0], intervals[0][1]});

        for (int i = 1; i < intervals.length; i++) {
            int[] last = ans.get(ans.size() - 1);
            if (intervals[i][0] <= last[1]) {
                last[1] = Math.max(last[1], intervals[i][1]);
                // updating last[1] is updating ans because refernce type assignment
            } else {
                ans.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
