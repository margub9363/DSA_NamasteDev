package greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Intervals {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 3}, {6, 9}};
//        int []x = new int[] {2,5};

//        int[][] arr = new int[][]{{1, 3}, {5,8}};
//        int []x = new int[] {3,5};

//        int[][] arr = new int[][]{{1, 3}, {6, 8}};
//        int[] x = new int[]{4, 5};

//        int[][] arr = new int[][]{{1, 3}, {6, 8}};
//        int[] x = new int[]{1, 9};

        int[][] arr = new int[][]{{1, 3}, {5, 8}};
        int[] x = new int[]{2, 6};

        List insert = insert(arr, x);

        System.out.println(insert(arr, x));
    }

    public static List insert(int[][] arr, int[] x) {
        int n = arr.length;
        List ans = new ArrayList();
        int i = 0;
        while (i < n && arr[i][1] < x[0]) {
            ans.add(arr[i]);
            ++i;
        }
        while (i < n && arr[i][0] <= x[1]) {
            x[0] = Math.min(x[0], arr[i][0]);
            x[1] = Math.max(x[1], arr[i][1]);
            ++i;
        }
        ans.add(new int[]{x[0], x[1]});
        while (i < n) {
            ans.add(arr[i]);
            ++i;
        }
        return ans;
    }
}
