import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] paper = new int[101][101];
		int num = scan.nextInt();
		int sub = 0;
		
		for(int i=1; i<=num; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			for(int j=A; j<A+10; j++) {
				for(int k=B; k<B+10; k++) {
					paper[j][k] += 1;
				}
			}
		}
		
		for(int x=0; x<101; x++) {
			for(int y=0; y<101; y++) {
				if(paper[x][y]>=1) {
					sub += 1;
				}
			}
		}
		
		System.out.println(sub);
	}
}