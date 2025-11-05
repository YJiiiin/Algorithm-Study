import java.util.*;
import java.io.*;  // 이 부분이 반드시 필요합니다!

public class Main {
    public static void main(String[] args) throws IOException { // IOException 던지기 추가
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        List<String> words = new ArrayList<>(wordCountMap.keySet());
        
        Collections.sort(words, (word1, word2) -> {
            int count1 = wordCountMap.get(word1);
            int count2 = wordCountMap.get(word2);
            if (count1 != count2) return count2 - count1;
            if (word1.length() != word2.length()) return word2.length() - word1.length();
            return word1.compareTo(word2);
        });

        for (String word : words) {
            bw.write(word + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
