package arrays;

public class ReverseAString {
    public static void main(String[] args) {
//        char[] input = new char[]{'h','e','l','l','o'};
        char[] input = new char[]{'H','a','n','n','a','h'};
        process(input);
    }

    private static void process(char[] input) {
        char x='_';
        for (int i = 0; i < input.length/2; i++) {
            x=input[input.length-1-i];
            input[input.length-1-i]= input[i];
            input[i] = x;
        }

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
    }
}
