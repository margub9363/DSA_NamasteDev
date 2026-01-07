package recursion;

public class SumOfAllNumbersInArray {
    public static void main(String[] args) {
        int []input = new int[] {3,2,1,10,4,5,2,3,4};
        System.out.println("Sum of the Numbers in a given array is : " + sumOfAllNumbersInTheGivenArray(input, input.length-1));

    }
    private static int sumOfAllNumbersInTheGivenArray(int [] input, int indexToSum) {
        if (indexToSum == 0) {
            return input[indexToSum];
        }
        else {
            return input[indexToSum]+sumOfAllNumbersInTheGivenArray(input, indexToSum-1);
        }
    }
}
