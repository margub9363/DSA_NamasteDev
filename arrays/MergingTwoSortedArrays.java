package arrays;

public class MergingTwoSortedArrays {
    public static void main(String[] args) {
//        ex1
//        int []firstArray = new int[] {1,2,3,0,0,0};
        int []firstArray = new int[] {1,2,9,0,0,0};
        int m = 3;
//        int [] secondArray = new int[] {2,5,6};
        int [] secondArray = new int[] {2,5,11};
        int n = 3;

/*
//      ex2
        int []firstArray = new int[] {1};
        int m = 1;
        int [] secondArray = new int[0];
        int n = 0;
        */
        mergeSortedArrays(firstArray,m,secondArray,n);
        printResultantArray(firstArray);
    }
    private static int[] mergeSortedArrays( int [] firstArray, int m, int [] secondArray, int n) {
        if(n==0)
            return firstArray;
        for (int i = n; i < firstArray.length; i++) {
            firstArray[i] = secondArray[i-n];
        }
        //sortArray
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < firstArray.length-1; i++) {
            if (firstArray[i]>firstArray[i+1]){
                temp = firstArray[i+1];
                firstArray[i+1]= firstArray[i];
                firstArray[i] = temp;
            }

        }
        return firstArray;
    }
    private static void printResultantArray(int[] mergedArray) {
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i]+" ");
        }
    }
}
