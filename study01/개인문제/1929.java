import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int M = scan.nextInt();
		int N = scan.nextInt();
		
		
        for(int i=Math.max(M,2); i<=N; i++) {
            int total = 0;
            int x = (int) Math.sqrt(i);
            for(int j=1; j<=x; j++) {
                if(i%j==0) {
                    total++;
                }
            }
            if(total==1) {
                System.out.println(i);
            }
        }
	}
}
