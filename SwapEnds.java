import java.util.Arrays;

public class SwapEnds {
    /*
        Input: An array of integers of any length
        Output: The array but with first and last element swapped
        Process: take the array and exchange the sequence
        print
     */

    public static void main(String[] args){
        int[] originalArray = {1,2,3,4,5};
        int firstElementOfArray = originalArray[0];
         originalArray[0]=originalArray[originalArray.length-1];
         originalArray[originalArray.length-1] = firstElementOfArray;
        System.out.println(Arrays.toString(originalArray));
        }

    }
