package warmup;

public class PalindromeOrNot {
    public static void main(String[] args) {
//        smartWay(1230321);
        isPalindrome(121030);
    }

    public static boolean isPalindrome(int input) {
        int reversedNumber = 0;
        int reminder = 0;
        int originalNumber = input;
        while (input > 10) {
            reminder = input % 10;
            input = input / 10;
            reversedNumber = reversedNumber*10 + reminder;
        }
        reversedNumber = reversedNumber * 10 + input;
        System.out.println("reversedNumber: "+ reversedNumber);
        return reversedNumber == originalNumber;
    }

    public static void smartWay(int input) {
        String string = input + "";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i] != charArray[charArray.length-1-i]){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Its Palindrome");
    }
}
