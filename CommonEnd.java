public class CommonEnd {

    public static void main(String[] args) {
        int[] firstArray = {5, 25, 9, 500, 2};
        int[] secondArray = {5, 6};
        if (firstArray[firstArray.length - 1] == secondArray[secondArray.length - 1]) {
            System.out.println("The two Arrays share the last element");
        } else if (firstArray[0] == secondArray[secondArray.length - 1] || firstArray[firstArray.length - 1] == secondArray[0]) {
            System.out.println("The two Arrays share the last and first element");
        } else if (firstArray[0] == secondArray[0]) {
            System.out.println("The two Arrays share the same first element");
        } else {
            System.out.println("The Arrays dont share the first or last element");
        }
    }
}