package arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Example 1:
Input: nums = [2, 2, 1]
Output: 1

Example 2:
Input: nums = [4, 1, 2, 1, 2]
Output: 4
 */
public class SingleNumber {
    public static void main(String[] args) {
        int []input = new int[] {2,2,1};
//        int []input = new int[] {2,2,3,4,6,7,9,6,4,3,4};
        int singleNumber = findSingleNumber(input);
        System.out.println("Single Digit: " + singleNumber );
    }
    private static int findSingleNumber(int[] input) {
        return Arrays.stream(input)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(0);
    }

}
