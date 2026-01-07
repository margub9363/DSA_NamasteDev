package recursion;

public class Factorial {
    public static void main(String[] args) {
        int input = 5;
        System.out.println("Factorial of " + input + " is: " + factorialOfN(input));
    }
    private static int factorialOfN(int n) {
        if (n<2) {
            return n;
        }
        else return n*factorialOfN(n-1);
    }
}
