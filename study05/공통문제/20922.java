import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); //수열 크기
		int K = Integer.parseInt(st.nextToken()); //중복 개수
		//수열
		int number[] = new int[N];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }
		
		//중복 체크
        int count[] = new int[100001];
        int start = 0;
        int end = 0;
        int maxL = 0;
        
        while(end<N) {
        	count[number[end]]++;
        	
        	//초과
        	while(count[number[end]]>K) {
        		count[number[start]]--; //왼쪽 끝 숫자 제거
        		start++; //왼쪽 축소
        	}
        	
        	maxL = Math.max(maxL, end-start+1);
        	end++;
        }
        
        System.out.println(maxL);
		bf.close();
	}
}
