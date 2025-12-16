import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int N = Integer.parseInt(st.nextToken()); //키워드 개수
		int M = Integer.parseInt(st.nextToken()); //글의 개수
		
		Set<String> word = new HashSet<>();
		List<String> text = new ArrayList<>();
		
		//키워드 단어
		for(int i=0; i<N; i++) {
			word.add(bf.readLine());
		}
		
		//사용한 단어
		for(int j=0; j<M; j++) {
			String t = bf.readLine();
			String[] splitText = t.split(",");
			//일치하는 단어 삭제
			for(String sText : splitText) {
				word.remove(sText);
			}
			
			System.out.println(word.size());
		}		
		bf.close();
	}
}
