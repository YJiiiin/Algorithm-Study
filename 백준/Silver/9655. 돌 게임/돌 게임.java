import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt(); //주어진 돌의 개수
		
		if(N%2==0) {
			System.out.println("CY");
		}
		else {
			System.out.println("SK");
		}
		
	}
}