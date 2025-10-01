import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int score = scan.nextInt();
		int P = scan.nextInt();
		int[] List = new int[N];
		int[] nList = new int[P];
		int L = 0; //등수
		
		if(N!=0) {
			for(int i=0; i<N; i++) {
				List[i] = scan.nextInt();
			}
			Arrays.sort(List);
			
			if(N==P && List[0]>=score) {
				System.out.println(-1);
			}
			else {
				for(int j=1; j<=N; j++) {
					if(List[N-j]<=score) {
						L = j;
						System.out.println(j);
						break;
					}
				}
				if(L==0) {
					System.out.println(N+1);
				}
			}
		}
		else {
			System.out.println(1);
		}
	}
}
