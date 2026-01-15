import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for(int t=0; t<T; t++) {
            long profit = 0;
            long max = 0; //최고가
            int N = Integer.parseInt(bf.readLine()); //날의 수
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int num[] = new int[N];

            for(int i=0; i<N; i++) {
                num[i] = Integer.parseInt(st.nextToken());
                if(i==N-1) {
                    max = num[i]; //마지막 날 주가
                }
            }

            for(int j=N-1; j>=0; j--) {
                if(num[j]<max) {
                    profit += (max-num[j]);
                }
                else {
                    max = num[j];
                }
            }

            System.out.println(profit);
        }
    }
}