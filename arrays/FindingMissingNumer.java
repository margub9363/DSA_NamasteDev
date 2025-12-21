package arrays;

public class FindingMissingNumer {
    public static void main(String[] args) {
        int[] input = new int[]{3,0,1};
        int n=0;
        int sumOfDigits = 0;
        for (int i = 0; i < input.length; i++) {
            sumOfDigits = sumOfDigits + input[i];
            if(input[i]>n) {
                n=input[i];
            }
        }
        double missingNumber = n*(n+1)*0.5 - sumOfDigits;
        System.out.println("Missing Number is : " + missingNumber);
    }

}


/*
        for (int i = 0; i < input.length-1; i++) {
            if (input[i]> input[i+1]) {
                temp= input[i];
                input[i] = input [i+1];
                input[i+1] = temp;
            }
        }
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+ " ");
        }

*/