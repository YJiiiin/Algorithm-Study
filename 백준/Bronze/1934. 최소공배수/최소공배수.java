import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int i=1; i<=T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			int N = Math.min(A, B);
			int M = Math.max(A, B);
			
			for(int j=1; j<=M; j++) {
				int num = N*j;
				
				if(num%M==0) {
					System.out.println(num);
					break;
				}
			}
			
		}
	}
}