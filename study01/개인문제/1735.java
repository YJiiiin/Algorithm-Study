import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A1 = scan.nextInt();
		int B1 = scan.nextInt();
		int A2 = scan.nextInt();
		int B2 = scan.nextInt();
		
		int A = (A1*B2) + (A2*B1);
		int B = B1*B2;
		
		int M = Math.max(A, B);
		int i = 1;
		
		while(i<=M) {
			if(A%i==0 && B%i==0) {
				A = A/i;
				B = B/i;
                i = 1;
			}
			i++;
		}
		
		System.out.println(A+" "+B);
	}
}
