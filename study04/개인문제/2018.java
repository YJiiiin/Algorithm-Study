import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int count = 1;
		int sum = 1;
		int start = 1;
		int end = 1;
		
		while(end<N) {
			if(sum<N) {
				end++;
				sum = sum + end;
			}
			else if(sum==N) {
				count++;
				end++;
				sum = sum + end;
			}
			else if(sum>N) {
				sum = sum - start;
				start++;
			}
		}
		
		System.out.println(count);
	}
}
