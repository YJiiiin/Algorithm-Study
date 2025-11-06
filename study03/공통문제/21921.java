import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //블로그 시작하고 지난 일수
		int X = scan.nextInt(); //가장 많이 들어온 방문자 수를 구해야 할 일수

		//N일 동안 하루 방문자 수
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}

		//첫날~X일까지의 방문자 수 합
		int sum = 0;
		for(int i=0; i<X; i++) {
			sum += arr[i];
		}
		int max = sum; //최댓값 설정
		int count = 1; //개수(최대 방문자 수가 갈은 기간의 개수)
		
		for(int i=X; i<N; i++) {
			sum = sum - arr[i-X] + arr[i]; //맨 첫번째 항은 빼주고 새로운 항을 더해준다.

			//최대 방문자 수
			if(sum>max) {
				max = sum;
				count = 1;
			}
			else if(sum==max) {
				count++;
			}
		}

		//출력
		if(max==0) {
			System.out.println("SAD");
		}
		else {
			System.out.println(max);
			System.out.println(count);
		}
		
	}
}


