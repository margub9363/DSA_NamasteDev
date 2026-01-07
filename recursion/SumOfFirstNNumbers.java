package recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {

        int input = 5;
//        sumOfNumbers(input);
        System.out.println("Sum of Numbers from " + input + " to 1 is: " + sumOfNumbers(input));
    }

    private static int sumOfNumbers(int number) {
        int sum =0;
        if (number == 0 ) {
            return 0;
        }
        sum = sum + number + sumOfNumbers( number -1);
        return sum;
    }
}
