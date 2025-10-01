import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[][] student = new int[N][5];
		int z = 0;
		int total = 0;
		int number = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<5; j++) {
				student[i][j] = scan.nextInt();
			}
		}
		
		while(z<N) {
			int sum = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<5; j++) {
					if(student[z][j]==student[i][j]) {
						sum++;
						break;
					}
				}
			}
			if(sum>total) {
				total = sum;
				number = z+1;
			}
			z++;
		}
		System.out.println(number);
	}
}