import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); //사람 수
        int people[] = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());

        for(int i=1; i<=N; i++){
            int s = 0;
            int h = Integer.parseInt(st.nextToken());

            for(int j=0; j<N; j++){
                if(s==h){
                    if(people[j]==0) {
                        people[j] = i;
                        break;
                    }
                }
                else {
                    if(people[j]==0 || people[j]>i){
                        s++;
                    }
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for (int val : people){
            sb.append(val).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();

    }
}
