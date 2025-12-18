package warmup;

public class CountOfDigits {
    public static void main(String[] args) {
        int input = 12345;
        System.out.println("No Of Digits Through Smart Way is: "+ smartWay(input));
        System.out.println("No Of Digits Through Logic is: "+ withLogic(input));
    }

    public static int smartWay(int input){
        String inputString = input + "";
        return inputString.length();
    }

    public static int withLogic(int input){
        int count = 0;
        while (input > 10 ) {
            input = input / 10;
            count++;
        }
        return count+1;
    }
}
