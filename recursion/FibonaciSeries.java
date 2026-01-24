package recursion;

// 0,1,1,2,3,5,8,13,21,34,...
public class FibonaciSeries {
    public static void main(String[] args) {

        int input = 1;
        System.out.println("Fibonacci of " + input + " is " + fibonacci(input));
        System.out.println("Fibonacci of " + (input+1) + " is " + fibonacci(input+1));
        System.out.println("Fibonacci of " + (input+2) + " is " + fibonacci(input+2));
        System.out.println("Fibonacci of " + (input+3) + " is " + fibonacci(input+3));
        System.out.println("Fibonacci of " + (input+4) + " is " + fibonacci(input+4));
        System.out.println("Fibonacci of " + (input+5) + " is " + fibonacci(input+5));
    }

    private static int fibonacci(int input) {
        if (input<=1)
            return 1;
        else return fibonacci(input-1) + fibonacci(input-2);
    }
}
