import java.util.Arrays;
import java.util.List;

public class SwapEnds {
    /*
        Input: An array of integers of any length
        Output: The array but with first and last element swapped
        Process: take the array and exchange the sequence
        print
     */

    public static void main(String[] args){
        List<Integer> originalArray = Arrays.asList(1,2,3,4,5);

        Integer firstElementOfArray = originalArray.getFirst();
        originalArray.set(0, originalArray.get(originalArray.size()-1));
        originalArray.set(originalArray.size()-1,firstElementOfArray);


        System.out.println(originalArray);


        }

    }
