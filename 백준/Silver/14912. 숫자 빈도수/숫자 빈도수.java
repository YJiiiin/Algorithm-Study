import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int D = scan.nextInt();
		int total = 0;
		int d = 0;
		
		for(int i=1; i<=N; i++) {
			int n = i;
			while(n>=10) {
				d = n%10;;
				if(d==D) {
					total++;
				}
				n = n/10;
			}
			if(n<10) {
				if(n==D) {
					total++;
				}
			}
			
		}
		System.out.println(total);
	}
}