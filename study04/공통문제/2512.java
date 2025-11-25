import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //지방의 수		
		
		long sum = 0;
		int max = 0;
		
		//지방 예산요청
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		long M = Long.parseLong(bf.readLine()); //총 예산
		
		if(sum<=M) {
			System.out.println(max);
		}
		else {
			int result = 0;
            int min = 1; //최소
			while(min<=max) {
				//최대,최소의 중간값
				int mid = (min+max)/2;
				long total = 0;
				for(int i=0; i<N; i++) {
					total += Math.min(arr[i], mid);
				}
				//총 합과 예산액을 비교하여 답 도출
				if(total<=M) {
					result = mid;
					min = mid + 1;
				}
				else {
					max = mid - 1;
				}
			}
			System.out.println(result);
		}
		bf.close();
	}
}
