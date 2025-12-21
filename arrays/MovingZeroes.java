package arrays;

public class MovingZeroes {
    public static void main(String[] args) {
        int[] input = new int[]{0, 1, 0, 3, 12};
        process(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    private static void process(int [] input) {
        int x=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]!=0) {
                input[x]= input[i];
                x++;
            }
        }
        for (int i = input.length+1-x; i <input.length ; i++) {
            input[i] = 0;
        }
    }

}
