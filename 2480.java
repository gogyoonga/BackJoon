import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);


        int [] arr = new int[3];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();


        if(arr[0]==arr[1] && arr[0]==arr[2]){
            // 같은 눈 3개
            System.out.println(10000+arr[0]*1000);
        }
        else if (arr[0]!=arr[1]&& arr[1]!=arr[2] &&arr[0]!=arr[2]) {
            // 모두 다른 눈
            Arrays.sort(arr);
            System.out.println(arr[2]*100);

        }else{
            // 같은 눈 2개
            Arrays.sort(arr);
            System.out.println(1000+arr[1]*100);
        }


    }
}
