import java.util.Arrays;

public class Front11 {

    // Input: 2 int arrays with unknown size
    // Output: Single Int Array containing the first element of both arrays
    // Process: - Both are empty: exit
    //          - First is empty: Get the first element of second array
    //          - Second is empty: Get the first element of first array
    //          - Both not empty: Get the first element from both


    public static void main(String[] args) {
        int[] array1 = {2, 5, 6};
        int[] array2 = {10, 13, 70};

        if (array1.length == 0 && array2.length == 0) {
            System.out.println("Both Arrays are empty");
            System.exit(0);
        }
        else if(array1.length == 0) {
            int[] newArray = {array2[0]};
            System.out.println(newArray[0]);
        }
        else if(array2.length == 0) {
            int[] newArray = {array1[0]};
            System.out.println(newArray[0]);
        }
        else {
            int[] newArray = {array1[0] , array2[0]};
            System.out.println(newArray[0] +", "+ newArray[1] );
        }
    }
}