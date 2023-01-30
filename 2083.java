import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){
            String name = sc.next();
            int age = sc.nextInt();
            int weight = sc.nextInt();
            String grade;
            if(name.equals("#")) break;
            if(age>17 || weight>=80){
                grade = "Senior";
            }else{
                grade = "Junior";
            }
            System.out.println(name+" "+grade);
        }


    }
}
