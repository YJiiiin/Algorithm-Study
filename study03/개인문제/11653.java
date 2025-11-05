import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		if(N!=1) {
			while(true) {
				N = divi(N);
				if(N==1) {
					break;
				}
			}
		}
	}
	
	public static int divi(int M) {
		for(int i=2; i<=M; i++) {
			if(M%i==0) {
				System.out.println(i);
				M = M/i;
				break;
			}
		}
		return M;
	}
}
