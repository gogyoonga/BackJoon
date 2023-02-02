import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String [] dna = new String[n];
        char [][] arr = new char[m][n];
        for(int i=0; i<n; i++){
            dna[i] = bf.readLine();
            for(int j=0; j<m; j++){
                //각 열 별로 가장 많이 있는 것. 같은 수가 있으면 A넣기(사전순)
                arr[j][i] = dna[i].charAt(j);

                }
            }
        String hdDNA = "";
        for(int i=0;i<m;i++) {
            int a = 0, c = 0, g = 0, t = 0;
            int max = 0;
            for (int j = 0; j < n; j++) {
                char ch = arr[i][j];
                switch (ch) {
                    case 'A' -> a++;
                    case 'C' -> c++;
                    case 'G' -> g++;
                    case 'T' -> t++;
                }
                if(a>max){ max=a;}
                else if(c>max) {max=c;}
                else if(g>max) {max=g;}
                else if(t>max) {max=t;}

            }
            if(a==max){hdDNA += "A";}
            else if(c==max){hdDNA += "C";}
            else if(g==max){hdDNA += "G";}
            else if(t==max){hdDNA += "T";}

        }

        System.out.println(hdDNA);
        int num = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] != hdDNA.charAt(i)) num++;
            }
        }
        System.out.println(num);

    }
}
