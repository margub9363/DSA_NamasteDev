package searchingAndSorting.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] input = new int[]{1, 6, -3, 60, 3, 47, 5};
//        int [] input = new int[] {1,6,30,60,300,470,500}; // already swapped
//        int [] input = new int[] {1000,6000,300,60,300,470,500}; // already swapped
        System.out.println("Before Selection Sort:");
        printArrays(input);
        selectionSorting(input);
        System.out.println("\nAfter Selection Sort:");
        printArrays(input);

    }

    private static int[] selectionSorting(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if(input[minIndex] > input[j]) {
                    minIndex = j;
                }
            }
            if(minIndex!=i) {
                int temp=0;
                temp = input[minIndex];
                input[minIndex] = input[i];
                input[i] = temp;
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
