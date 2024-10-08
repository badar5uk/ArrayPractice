import java.util.Arrays;
import java.util.Scanner;

public class ArraySeriesPattern {
    /*
    Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
    Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
     */
    public static void main(String[]args){
        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int arraySize = userInp.nextInt();
        int l = arraySize *(arraySize +1)/2;
        int[] finalArray = new int[l];
        int bound = 0;
        for(int i =1; i <= arraySize; i++){
            for(int j = 1; j<=i; j++){
                finalArray[bound] = j;
                bound++;
            }
        }
        System.out.println(Arrays.toString(finalArray));
    }
}
