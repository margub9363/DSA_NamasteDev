package arrays;
/*
i/p
    {3,2,2,3}; , val=2
 o/p
    [3,3,-1,-1]

*/

public class RemoveDuplicates {
    public static void main(String[] args) {
//        int[] input = new int[] {3,2,2,3};
//        int elementToRemove = 2;
        int[] input = {0, 1, 2, 2, 3, 0, 4, 2};
        int elementToRemove = 2;
        process(input, elementToRemove);
    }

    public static void process(int[] inputArray , int removableElement) {
        int x=0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != removableElement) {
                inputArray[x] = inputArray[i];
                x++;
            }
        }
        for (int i = x; i < inputArray.length; i++) {
            inputArray[i] = -1;
        }
        for (int i = 0; i <inputArray.length; i++) {
            System.out.print(inputArray[i]+", ");
        }
    }
}
