public class FirstSix {

public static void main(String[] args) {
        boolean containsSix = false;
        int[] arrayOfInt = {1, 25, 9, 500, 6};
        if (arrayOfInt[0] == 6 || arrayOfInt[arrayOfInt.length - 1] == 6) {
            System.out.println("array contains 6");
        }
        else {
            System.out.println("Array does not contain 6");
        }
    }
}
