import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int n = 0;
		int s = 0;
		int sum = 0;
		
		while(sum<X) {
			n++;
			sum += n;
		}
		
		if(sum==X) {
			if(n%2==0) {
				System.out.println(n+"/"+1);
			}
			else {
				System.out.println(1+"/"+n);
			}
		}
		else {
			if(n%2==0) {
				s = sum - X;
				int A = n - s;
				int B = 1 + s;
				System.out.println(A+"/"+B);
			}
			else {
				s = sum - X;
				int A = n - s;
				int B = 1 + s;
				System.out.println(B+"/"+A); 
			}
		}
		
	}
}
