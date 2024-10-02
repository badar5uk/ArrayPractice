import java.util.Arrays;
import java.util.List;

public class ArrayContainsSix {
    /*
    Checks if the list contains a 6 at the start or end of and returns a Boolean if true.
     */

public static void main(String[] args) {
    List<Integer> arrayofInt = Arrays.asList(6, 25, 9, 500, 6);
        Boolean checker = false;
        if (arrayofInt.getFirst() == 6 && arrayofInt.get(arrayofInt.size() - 1) == 6) {
            checker = true;
            System.out.println(checker);
        }
        else if (arrayofInt.get(arrayofInt.size() - 1) == 6){
            checker = true;
            System.out.println(checker);
        }
        else if (arrayofInt.getFirst() == 6){
            checker = true;
            System.out.println(checker);
        }
        else {
            System.out.println(checker);
        }
    }
}
