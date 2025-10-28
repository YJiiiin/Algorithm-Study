import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //국가 수
		int K = scan.nextInt(); //알고 싶은 국가
		
		//국가 번호, 금, 은, 동, 순위
		int[][] array = new int[N][5];
		
		int num = 1;
		int Nnum = 0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<4; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		//오름차순 정렬
		Arrays.sort(array, (o1, o2) -> {
			if(o1[1]==o2[1]) {
				if(o1[2]==o2[2]) {
					return o1[3]-o2[3];
				}
				else {
					return o1[2]-o2[2];
				}
			}
			else {
				return o1[1]-o2[1];
			}
		});
		
		array[0][4] = num;
		for(int x=1; x<N; x++) {
			//순위 정하기
			if(array[x][1]==array[x-1][1] && array[x][2]==array[x-1][2] 
					&& array[x][3]==array[x-1][3]) {
				array[x][4] = num;	
				Nnum++;
			}
			else {
				num = num + 1 + Nnum;
				array[x][4] = num;
				Nnum = 0;
			}
			
			//순위 출력
			if(K==1) {
				System.out.println(array[0][4]);
				break;
			}
			else if(array[x][0]==K){
				System.out.println(array[x][4]);
				break;
			}
			
		}
			
	}
}
