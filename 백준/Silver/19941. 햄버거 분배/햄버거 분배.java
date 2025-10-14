import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //식탁 길이
		int K = scan.nextInt(); //햄버거 선택 거리
		
		int total = 0;
		int Ntotal = 0;
		
		//배열에 P, H 넣기
		String str = scan.next();
		String[] strArr = str.split(""); 
		for(int i=0; i<N; i++) {
			//왼쪽부터 탐색
			if(strArr[i].equals("P")){
				int L = i-K;
				if(L<0) {
					L = 0;
				}
				while(L<i) {
					if(strArr[L].equals("H")) {
						strArr[L] = "N";
						total++;
						break;
					}
					L++;
				}
				//왼쪽에서 못 찾았을 경우 오른쪽 탐색
				if(total<=Ntotal) {
					L = i+1;
					while(L<=i+K && L<N) {
						if(strArr[L].equals("H")) {
							strArr[L] = "N";
							total++;
							break;
						}
						L++;
					}
				}
			}
			Ntotal = total;
		}
		
		System.out.println(Ntotal);
		
	}
}