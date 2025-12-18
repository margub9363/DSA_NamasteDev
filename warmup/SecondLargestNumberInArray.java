package warmup;

import org.w3c.dom.ranges.Range;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int[] input = new int[]{ 934,1, 4, 6, 8, 543, 4, 5, 745, 456, 345 ,1099};
        System.out.println("Second Largest Number is: " + secondLargestNumberUsingArrays(input));
//        System.out.println("Second Largest Integer by using collection: " + secondLargestNumber(input));
    }

    //    sort the element & remove duplicate and get the second large index
    public static int secondLargestNumber(int[] input) {
        List<Integer> sortedList = Arrays.stream(input).boxed().distinct().sorted().collect(Collectors.toList());
        return sortedList.get(sortedList.size() - 2);
    }

    public static int secondLargestNumberUsingArrays(int[] input) {
        int firstLargest = Integer.MIN_VALUE, secondLargest=Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            if(input[i]>firstLargest) {
                secondLargest = firstLargest;
                firstLargest = input[i];
            } else if (input[i] > secondLargest) {
                secondLargest = input[i];
            }
        }
        return secondLargest;
    }
}
