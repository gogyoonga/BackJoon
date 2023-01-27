import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            int num = sc.nextInt();
            if(num == 0) break;
            int hap=1;
           for(int i=num; i>0; i/=10)
           {
               int n = i%10;
        switch(n) {
            case 1:
                hap += 2;
                break;
            case 0:
                hap += 4;
                break;
            default:
                hap += 3;
                break;
        }
               hap+=1;
           }

        System.out.println(hap);}
    }
}

