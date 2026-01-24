package twoPointersAndSlidingWindowProblem;

public class IndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        /*String inputArray = "saturdaysad";
        String needle = "sad";*/

        String inputArray = "onionionsky";
        String needle = "onions";

        int index = process(inputArray.toLowerCase().toCharArray(), needle.toString().toLowerCase().toCharArray());
        if (index == -1) {
            System.out.println("Match Failed");
        } else {
            System.out.println("Match Found at posititon: " + index);
        }

    }

    private static int process(char[] inputArray, char[] needle) {
        for (int i = 0; i <= inputArray.length - needle.length; i++) {
            for (int j = 0; j < needle.length; j++) {
                if (inputArray[i + j] != needle[j]) {
                    break;
                }
                System.out.println("inputArray[i + j](" + inputArray[i + j] + ") + == needle[j]" + "(" + needle[j] + ")");
                if (j == needle.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
