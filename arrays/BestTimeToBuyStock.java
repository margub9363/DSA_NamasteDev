package arrays;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
//        int [] input = new int[] {7,1,5,3,6,4};
//        int [] input = new int[] {7,1,4,8,1,0};
        int [] input = new int[] {7,6,4,8,1,0};
        int bestProfit = process(input);
        System.out.println("For the Given Input, we could have maximum profit as: " + bestProfit);
    }

    private static int process(int[] input) {
        int profit = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            for (int j= i; j <input.length ; j++) {
                if(profit< (input[j]-input[i]))
                {
                    profit = input[j]-input[i];
                }
            }
        }
        return profit;
    }
}
