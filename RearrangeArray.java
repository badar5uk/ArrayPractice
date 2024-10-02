import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {
    /*
    Input: An array of integers that contains a three and a four
    Output: the array with 3s and 4s re-arranged to be next to each other
    Process: - 2 for loops that check the element
             - if it is equal to 3, dont move
             - if equal to 4 then move it next to the 3
     */
    public static void main(String[]args){
         ArrayList<Integer> arrayOfIntegers = new ArrayList<>();
         arrayOfIntegers.add(1);
         arrayOfIntegers.add(3);
         arrayOfIntegers.add(4);
         arrayOfIntegers.add(3);
         arrayOfIntegers.add(20);
         arrayOfIntegers.add(5);
         arrayOfIntegers.add(4);
         arrayOfIntegers.add(3);
         arrayOfIntegers.add(4);
                // {1, 3, 4, 3, 20 , 5, 4, 3, 4};
        int store = 0;

        for(int i = 0; i<arrayOfIntegers.indexOf(i); i++){
            if(arrayOfIntegers.get(i) ==3){
                int j;
                j=i+1;
                while (arrayOfIntegers.get(j) != 4){
                    j++;
                }
                store = arrayOfIntegers.get(i + 1);
                arrayOfIntegers.set(i + 1, 4);
                arrayOfIntegers.set(j, store);
            }
        }       System.out.println(arrayOfIntegers);
    }
}
