import java.util.Arrays;
import java.util.List;

public class CommonEnd {

    public static void main(String[] args) {
        List<Integer> firstArray = Arrays.asList(5, 25, 9, 500, 6);
        List<Integer> secondArray = Arrays.asList(5, 6);
        if (firstArray.getFirst() == secondArray.get(secondArray.size() - 1) || firstArray.get(firstArray.size() - 1) == secondArray.getFirst()) {
            System.out.println("The two Arrays share the last element");
        } else if (firstArray.get(firstArray.size() - 1) == secondArray.get(secondArray.size() - 1)) {
            System.out.println("The two Arrays share the last and first element");
        } else if (firstArray.getFirst() == secondArray.getFirst()) {
            System.out.println("The two Arrays share the same first element");
        } else {
            System.out.println("The Arrays dont share the first or last element");
        }
    }
}