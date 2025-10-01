import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int n = 0;
		int T = 1;
		int sum = 1;
		
		while(sum<X) {
			T++;
			n += 6;
			sum += n;
		}
		
		System.out.println(T);
		
	}
}