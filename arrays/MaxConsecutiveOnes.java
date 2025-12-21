package arrays;
/*
i/p: [1,1,0,1,1,1]
o/p: 3
*/

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int []input = new int[] {1,1,0,1,1,1};
//        int []input = new int[] {1,1,0,1,1,1,0,1,1,1,1,0,1,1,1};
        int maxConsecutiveOnes = 0;
        int x = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]==1) {
                x++;
                if(maxConsecutiveOnes<x){
                    maxConsecutiveOnes=x;
                }
            } else {
                x=0;
            }
        }
        System.out.println("Max Consecutive Integer is : " + maxConsecutiveOnes);
    }
}
