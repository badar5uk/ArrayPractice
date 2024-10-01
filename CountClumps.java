public class CountClumps {
    public static void main(String[] args) {
        int[] t = {1,1,2,2,2,3,4,4,4,5,6,7,7};
        int repeat = 0;
        boolean[] clumps = new boolean[9];
        for (int i = 0; i < t.length; i++) {
            int element = t[i];
            for (int j = i + 1; j < t.length; j++) {
                if (element == t[j]) {
                    int index = t[j];
                    clumps[index] = true;
                } else if (element != t[j]) {
                    i = j - 1;
                    break;
                }
                if(j == t.length -1){
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
