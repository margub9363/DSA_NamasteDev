package greedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Interval {
    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 3}, {6, 9}};
//        int []x = new int[] {2,5};

//        int[][] arr = new int[][]{{1, 3}, {5, 8}};
//        int[] x = new int[]{3, 5};

//        int[][] arr = new int[][]{{1, 3}, {6, 8}};
//        int[] x = new int[]{4, 5};

        int[][] arr = new int[][]{{1, 3}, {6, 8}};
        int[] x = new int[]{1, 9};

        List<int[]> insert = insert(arr, x);
        printOutput(insert);
    }

    public static List<int[]> insert(int[][] arr, int[] x) {
        int n = arr.length;
        List<int[]> output = new ArrayList<>();
        int i = 0;
        while (i < n && arr[i][1] < x[0]) {
            output.add(arr[i]);
            i++;
        }

        while (i < n && arr[i][0] <= x[1]) {
            x[0] = Math.min(arr[i][0], x[0]);
            x[1] = Math.max(arr[i][1], x[1]);
            i++;
        }
        output.add(x);

        while (i < n) {
            output.add(arr[i]);
            i++;
        }
        return output;
    }

    public static void printOutput(List<int[]> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            int[] ints = arrList.get(i);
            System.out.println(ints[0] + "  -  " + ints[1]);
        }
    }
}
