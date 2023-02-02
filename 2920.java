import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(bf.readLine()," ");
        int arr[] = new int[8];

        for(int i=0; i<8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int [] sarr = Arrays.copyOf(arr,arr.length);
        int [] rarr = Arrays.copyOf(arr,arr.length);
        Arrays.sort(sarr);
        Integer [] iarr = Arrays.stream(rarr).boxed().toArray(Integer[]::new);
        Arrays.sort(iarr, Comparator.reverseOrder());
        int [] irarr = Arrays.stream(iarr).mapToInt(Integer::intValue).toArray();
        if(Arrays.equals(arr,sarr)){
            System.out.println("ascending");
        } else if (Arrays.equals(arr,irarr)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");

        }
    }
}
