import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountClumps {
    public static void main(String[] args) {
        List<Integer> t = Arrays.asList(1,1,2,2,3,4,4,4,5,6,7,7);

        int repeat = 0;
        boolean[] clumps = new boolean[9];
        for (int i = 0; i < t.size(); i++) {
            int element = t.get(i);
            for (int j = i + 1; j < t.size(); j++) {
                if (element == t.get(j)) {
                    int index = t.get(j);
                    clumps[index] = true;
                } else if (element != t.get(j)) {
                    i = j - 1;
                    break;
                }
                if(j == t.size() -1){
                    i = j;
                }
            }
        }        for(int i=0; i<clumps.length; i++){
            if(clumps[i] == true){
                repeat++;
            }

        }
        System.out.println(repeat + " clumps are present");
    }
}
