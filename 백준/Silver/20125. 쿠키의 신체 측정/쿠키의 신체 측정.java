import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		
		char[][] cookie = new char[N][N];
		int headX = 0, headY = 0;
		
		//2차 배열 넣기
		for(int i=0; i<N; i++) {
			String line = scan.nextLine();
			for(int j=0; j<N; j++) {
				cookie[i][j] = line.charAt(j);
			}
		}
		
		//머리 위치 확인
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(cookie[i][j]=='*') {
                	headX = i;
                	headY = j;
                	break;
                }
            }
            if(headY != 0 ) break;
        }
        
        //심장 위치 
        int heartX = headX+1+1;
        int heartY = headY+1;
        
        //팔 길이
        int Aleft = 0, Aright = 0;
        for(int i=0; i<headY; i++)
        	if(cookie[headX+1][i]=='*') {
        		Aleft++;
        	}
        for(int i=headY+1; i<N; i++)
        	if(cookie[headX+1][i]=='*') {
        		Aright++;
        	}
        
        //허리 길이
        int Waist = 0;
        for(int i=headX+2; i<N; i++)
        	if(cookie[i][headY]=='*') {
        		Waist++;
        	}
        
        //다리 길이
        int Lleft = 0, Lright = 0;
        for(int i=headX+2; i<N; i++)
        	if(cookie[i][headY-1]=='*') {
        		Lleft++;
        	}
        for(int i=headX+2; i<N; i++)
        	if(cookie[i][headY+1]=='*') {
        		Lright++;
        	}
        
		System.out.println(heartX + " " + heartY );
		System.out.println(Aleft + " " + Aright + " " + Waist + " " + Lleft + " " + Lright);
	}
}