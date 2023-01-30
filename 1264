import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while(true){
            String s = sc.nextLine();
            
            if(s.equals("#")){
                break;
            }
            String s1 = s.toLowerCase();

            int n = 0;
            for(int i=0; i<s1.length(); i++){
                char c = s1.charAt(i);
                switch (c) {
                    case 'a', 'e', 'i', 'o', 'u' -> n++;
                    default -> throw new IllegalStateException("Unexpected value: " + c);
                }
            }

            System.out.println(n);

        }
    }}
