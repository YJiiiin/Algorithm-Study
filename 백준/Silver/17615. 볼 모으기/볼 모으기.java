import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); //볼의 총 개수
        String ball = bf.readLine(); // 볼의 색깔

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        boolean skip = true;
        String bColor[] = ball.split("");

        //1. 빨간 공을 왼쪽으로 보낼 때
        for(int i=0; i<N; i++) {
            if(bColor[i].equals("B")) {
                skip = false;
            }
            if(!skip&& bColor[i].equals("R")) {
                count1++;
            }
        }

        skip = true;
        //2. 빨간 공을 오른쪽으로 보낼 때
        for(int i=N-1; i>=0; i--) {
            if(bColor[i].equals("B")) {
                skip = false;
            }
            if(!skip&& bColor[i].equals("R")) {
                count2++;
            }
        }

        skip = true;
        //3. 파란 공을 왼쪽으로 보낼 때
        for(int i=0; i<N; i++) {
            if(bColor[i].equals("R")) {
                skip = false;
            }
            if(!skip&& bColor[i].equals("B")) {
                count3++;
            }
        }

        skip = true;
        //4. 파란 공을 오른쪽으로 보낼 때
        for(int i=N-1; i>=0; i--) {
            if(bColor[i].equals("R")) {
                skip = false;
            }
            if(!skip&& bColor[i].equals("B")) {
                count4++;
            }
        }

        int result = Math.min(count1, Math.min(count2, Math.min(count3, count4)));
        System.out.println(result);

    }
}