import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			int max = Math.max(a, Math.max(b, c));
			int sum = a + b + c;
			
			if(a==0 & b==0 & c==0) {
				break;
			}
			else {
				if(sum-max<=max) {
					System.out.println("Invalid");
				}
				else if(a==b) {
					if(a==c) {
						System.out.println("Equilateral");	
					}
					else {
						System.out.println("Isosceles");
					}				
				}
				else if(b==c & a!=b) {
					System.out.println("Isosceles");		
				}
				else if(a==c & b!=c) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}			
		}
	}
}
