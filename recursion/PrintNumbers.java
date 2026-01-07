package recursion;

// Print numbers from n to 1 using recursion.
public class PrintNumbers {
    public static void main(String[] args) {
        int input = 10;
        printNumbersToN(input);
    }

    private static void printNumbersToN(int number) {
        if( number == 0 ){
            return;
        }
        System.out.print(number + " ");
        printNumbersToN(number-1);
    }
}
