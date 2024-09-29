public class ArrayContainsSix {

public static void main(String[] args) {
        int[] arrayOfInt = {6, 25, 9, 500, 5};
        boolean checker = false;
        if ( arrayOfInt[0] == 6 && arrayOfInt[arrayOfInt.length - 1] == 6) {
            checker = true;
            System.out.println(checker);
        }
        else if ( arrayOfInt[arrayOfInt.length - 1] == 6){
            checker = true;
            System.out.println(checker);
        }
        else if ( arrayOfInt[0] == 6){
            checker = true;
            System.out.println(checker);
        }
        else {
            System.out.println(checker);
        }
    }
}
