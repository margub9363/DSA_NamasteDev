package recursion;

public class IsInPowerOf2 {
    public static void main(String[] args) {
        int input = 16;
        System.out.println("The given no (" + input + ") is in the power of Two: " + isTheGivenInputIsInPowerOfTwo(input));
    }

    private static boolean isTheGivenInputIsInPowerOfTwo(int n) {
        if (n >= 2 && n % 2 == 0) {
            return n / 2 == 1 || isTheGivenInputIsInPowerOfTwo(n / 2);
        }
        return false;
    }
}
