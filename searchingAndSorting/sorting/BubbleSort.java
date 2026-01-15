package searchingAndSorting.sorting;

public class BubbleSort {
    public static void main(String[] args) {
//        int [] input = new int[] {1,6,-3,60,3,47,5};
//        int [] input = new int[] {1,6,30,60,300,470,500}; // already swapped
        int [] input = new int[] {1000,6000,300,60,300,470,500}; // already swapped
        System.out.println("Before Bubble Sort:");
        printArrays(input);
        bubbleSorting(input);
        System.out.println("\nAfter Bubble Sort:");
        printArrays(input);

    }

    private static int [] bubbleSorting(int [] input) {
        int temp =0;
        boolean isSwapped = false;
        for (int i = 0; i < input.length; i++) {
            isSwapped = false;
            for (int j = 0; j < input.length-i-1; j++) {
                if(input[j] > input[j+1]) {
                    temp = input [j];
                    input[j] = input [j+1];
                    input[j+1] = temp;
                    isSwapped=true;
                }

            }if(!isSwapped){
                System.out.println("\nexiting... after i=" + i);
                return input;
            }
        }
        return input;
    }
    public static void printArrays(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + "  ");
        }
    }
}
