import java.util.Arrays;

public class MaxTriple {
    /* Input: Two arrays of length 2
        Output: The array with the largest sum of the two
        process: - hard coding 2 arrays with length 2
                 - Checking the sum of the values of each array
                 - comparing the sum of the arrays and printing out the array with the largest sum
     */
    public static void main(String[] args) {
        int[] array1 = {5, 7};
        int[] array2 = {2, 6};

        if (array1[0] + array1[1] > array2[0] + array2[1]) {
            String newArray = Arrays.toString(array1);
            System.out.println(newArray);
        }
        if (array1[0] + array1[1] < array2[0] + array2[1]) {
            String newArray = Arrays.toString(array2);
            System.out.println(newArray);

        }
        else if (array1[0] + array1[1] == array2[0] + array2[1]){
            String newArray = Arrays.toString(array1);
            System.out.println(newArray);

        }
    }
}
