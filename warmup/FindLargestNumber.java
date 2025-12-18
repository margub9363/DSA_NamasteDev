package warmup;

// Find the largest number when a negative integer is present
public class FindLargestNumber {
    public static void main(String[] args) {
        int [] input = {0,3,5,-6,-44,34,-345};
//        int largestNumber = 0; << here if we assume 0 then also it will fail so the good idea is to keep Integer.MIN_VALUE
        int largestNumber = Integer.MIN_VALUE;
        for (int i=0; i<input.length; i++) {
            if (input[i]>largestNumber) {
                largestNumber = input[i];
            }
        }
        System.out.println(largestNumber);
    }
}
