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

        String []arr = new String[n];
        int x=0; //추가할 경비원 수


        for (int i=0; i<n; i++){
            // 행
            boolean status = false; //경비 없음 디폴트
            arr[i] = bf.readLine();
            for(int j=0; j<m; j++){
                // 열
                if (arr[i].charAt(j) == 'X'){
                    status = true; //경비 있으면 상태변경
                    break;
                }
                if(j==m-1){
                    //열 끝까지 경비가 없을시 경비 한명 배치해야 함.
                    x++;
                }
            }
        }
        // 행에 경비원이 없으면 경비 배치함.
        // 열에 경비원이 없으면? 경비 배치함. 근데, 열 배치수 행 배치수 더 큰 거가 최솟값.
        char [][] nrr = new char[m][n];
        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                nrr[j][i] = arr[i].charAt(j);
            }
        }

        int y=0;
        for(int i=0; i<m; i++){
            boolean status = false;

            for(int j=0; j<n; j++){
                if (nrr[i][j]== 'X'){
                    status = true; //경비 있으면 상태변경
                }
                if (status){
                    break; // 경비 있으면 다음 행으로 넘어감
                }
                if(j==n-1){
                    //열 끝까지 경비가 없을시 경비 한명 배치해야 함.
                    y++;
            }
        }}
        System.out.println(Math.max(x,y));

    }
}
