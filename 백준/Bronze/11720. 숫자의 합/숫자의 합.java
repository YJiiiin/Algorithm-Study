import java.util.*;

public class Main{
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();
    	String text = scan.next();
    	int sum = 0;
    	
    	for(int i=0; i<N; i++) {
    		sum += text.charAt(i) - '0';
    	}
    	
    	System.out.println(sum);
    }
}