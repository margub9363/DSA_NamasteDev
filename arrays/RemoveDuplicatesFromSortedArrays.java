package arrays;
/*
you are given a sorted array ( [0, 0, 1, 1, 1, 2, 2, 3, 3, 4] )
you have to keep the unique digits only and get the count of the unique digits
and the remaining places you can fill with -1
*/

public class RemoveDuplicatesFromSortedArrays {
    public static void main(String[] args) {
        int [] input = new int[] {1,1,2};
//        int[] input = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        process(input);

    }

    public static void process(int[] input) {
        int x=0;
        for (int i = 0; i < input.length; i++) {
            if(input[i] > input[x]){
                x++;
                input[x] = input[i];
            }
        }

        System.out.println("No of Unique Digits: " + x);
        for (int i = 0; i < input.length; i++) {
            if (i > x) {
                input [i] = -1;
            }
            System.out.print(input[i] + " ");
        }
    }
}

