import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Front11 {

    // Input: 2 int arrays with unknown size
    // Output: Single Int Array containing the first element of both arrays
    // Process: - Both are empty: exit
    //          - First is empty: Get the first element of second array
    //          - Second is empty: Get the first element of first array
    //          - Both not empty: Get the first element from both


    public static void main(String[] args) {
        List<Integer> array1 = Arrays.asList(4,5,6);
        List<Integer> array2 = Arrays.asList(10,13,70);

        if (array1.size() == 0 && array2.size() == 0) {
            System.out.println("Both Arrays are empty");
            System.exit(0);
        }
        else if(array1.size() == 0) {
            int[] newArray = {array2.get(0)};
            System.out.println(newArray[0]);
        }
        else if(array2.size() == 0) {
            int[] newArray = {array1.get(0)};
            System.out.println(newArray[0]);
        }
        else {
            int[] newArray = {array1.get(0), array2.get(0)};
            System.out.println(newArray[0] +", "+ newArray[1] );
        }
    }
}