import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int P = scan.nextInt(); 
		
		for(int i=1; i<=P; i++) {
			int T = scan.nextInt();
			int[] Harray = new int[20];
			int total = 0; //걸음 수
			
			for(int j=0; j<20; j++) {
				Harray[j] = scan.nextInt(); 
				
				for(int k=0; k<=j; k++) {
					if(Harray[k]>Harray[j]) {
						int temp = Harray[j]; //임시 변수에 저장
						for(int x=j; x>k; x--) {
							Harray[x] = Harray[x-1];
							total++; 
						}
						Harray[k] = temp;
						break; 
					}
				}
			}
			System.out.printf("%d %d \n", T, total);
		}	
	}
}