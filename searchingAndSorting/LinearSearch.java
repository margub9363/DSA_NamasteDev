package searchingAndSorting;

public class LinearSearch {
    public static void main(String[] args) {
        int [] inputArray = new int[] {1,4,6,3,23,6,7,3};
        int key = 23;
        int index = linearSearchAlgo(inputArray, key);
        if(index!= -1) {
            System.out.println("Key exists at the position: " + linearSearchAlgo(inputArray, key));
        } else System.out.println("Key not found");
    }

    private static int linearSearchAlgo(int [] input, int key) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == key)
                return i;
        }
        return -1;
    }
}
