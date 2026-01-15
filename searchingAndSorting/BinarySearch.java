package searchingAndSorting;

// we will assume that the input is always sorted
public class BinarySearch {
    public static void main(String[] args) {
        int []  input = new int[] { 0, 1, 2, 3, 4, 5, 6};
        int key = 60;
        int index = binarySearchAlg(input, key);
        if (index != -1){
            System.out.println("Element found at "+ index);
        } else {
            System.out.println("Element did not found");
        }
    }
    private static int binarySearchAlg(int[] input, int key) {
        int leftIndex=0, rightIndex=input.length-1;
        int midIndex = -1;
        int position=-1;
        while (leftIndex<=rightIndex) {
            midIndex = (leftIndex + rightIndex)/2;
            if (key == input[midIndex]) {
                position = midIndex;
                break;
                // return midIndex;
            } else if (key<input[midIndex]) {
                rightIndex = midIndex -1;
            } else {
                leftIndex = midIndex +1;
            }
        }
        return position;
    }
}
