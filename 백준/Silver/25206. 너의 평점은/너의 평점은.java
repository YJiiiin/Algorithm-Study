import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double total = 0;
		double S = 0;
		
		for(int i=1; i<=20; i++) {
			String sName = scan.next();
			double num = scan.nextDouble();
			String grade = scan.next();
			
			if(!grade.equals("P")) {
				double T = score(num, grade);
				total += T;
				S += num;
			}
		}
		
		total = total/S;
		System.out.println(total);
	}
	
	public static double score(double num, String grade) {
		double sum = 0;
		switch(grade) {
			case "A+":
				sum = num*4.5;
				break;
			case "A0":
				sum = num*4.0;
				break;
			case "B+":
				sum = num*3.5;
				break;
			case "B0":
				sum = num*3.0;
				break;
			case "C+":
				sum = num*2.5;
				break;
			case "C0":
				sum = num*2.0;
				break;
			case "D+":
				sum = num*1.5;
				break;
            case "D0":
				sum = num*1.0;
				break;
			case "F":
				sum = num*0.0;
				break;
		}
		return sum;
	}
}
