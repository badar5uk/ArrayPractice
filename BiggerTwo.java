import java.util.Arrays;

public class BiggerTwo {

    public static void main(String[] args) {
        int[] array1 = {10, 7};
        int[] array2 = {7, 6};

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