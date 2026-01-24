package dynamicProgramming;

public class FibonacciSeries_BottomUpApproach {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series using Bottom Down Approach ");
        int input = 10;
        int[] fibonacciSeriesArray = new int[input+2];
        fibonacciSeriesArray[0] = 0;
        fibonacciSeriesArray[1] = 1;

        for (int i = 2; i <input+2 ; i++) {
            fibonacciSeriesArray[i] = fibonacciSeriesArray[i-2] + fibonacciSeriesArray [i-1];
        }
        System.out.println("Output ---");
        for (int i = 0; i < fibonacciSeriesArray.length; i++) {
            System.out.print(fibonacciSeriesArray[i] + "  ");
        }

    }
}
