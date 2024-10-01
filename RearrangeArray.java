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
        int[] arrayOfIntegers = {1, 3, 4, 3, 20 , 5, 4, 3, 4};
        int store = 0;

        for(int i = 0; i<arrayOfIntegers.length; i++){
            if(arrayOfIntegers[i]==3){
                int j;
                j=i+1;
                while (arrayOfIntegers[j] != 4){
                    j++;
                }
                store = arrayOfIntegers[i+1];
                arrayOfIntegers[i+1]=4;
                arrayOfIntegers[j] = store;
            }
        }       System.out.println(Arrays.toString(arrayOfIntegers));
    }
}
