import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //학생 수
		
		int[][] array = new int[N][2];
		
		//입력 받기
		for(int i=0; i<N; i++) {
			for(int j=0; j<2; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		//등수 구하기
		for(int i=0; i<N; i++) {
			int total = 1;
			for(int j=0; j<N; j++) {
				if(array[i][0]<array[j][0]) {
					if(array[i][1]<array[j][1]) {
						total++;
					}
				}
			}
			System.out.print(total+" ");
		}
		
	}
}