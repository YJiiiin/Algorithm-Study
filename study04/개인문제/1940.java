import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //재료 개수
		int M = Integer.parseInt(bf.readLine()); //필요한 수
		
		int sum = 0;
		int count = 0;
		
		//재료 번호 -> 숫자 배열로 변환
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		//오름차순 정렬
		Arrays.sort(arr);
		
		//구하기
		for(int start=0; start<N; start++) {
			int end = start+1;
			while(end<N) {
				sum = arr[start] + arr[end];
				if(sum<M) {
					end++;
				}
				else if(sum==M) {
					count++;
					break;
				}
				else if(sum>M) {
					break;
				}
			}
		}
		
		System.out.println(count);
		bf.close();
	}
}
