package dynamicProgramming;

public class FibonacciSeries_TopDownApproach {

    // dp array to store computed Fibonacci values
    static int[] dp;

    public static int fibonacci(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return n;
        }

        // If already computed, return it
        if (dp[n] != -1) {
            return dp[n];
        }

        // Compute and store the result
        dp[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return dp[n];
    }


    public static void main(String[] args) {
        int n = 10;

        // Initialize dp array with -1
        dp = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
