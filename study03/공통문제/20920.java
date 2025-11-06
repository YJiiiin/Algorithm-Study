import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) throws IOException {
        //빠른 입출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //단어 개수
        int M = Integer.parseInt(st.nextToken()); //외워야 할 단어 최소 길

        //단어 길이가 M이상일 때 저장
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        //단어 출력 위해 List 변환
        List<String> words = new ArrayList<>(wordCountMap.keySet());

        //정렬
        Collections.sort(words, (word1, word2) -> {
            int count1 = wordCountMap.get(word1);
            int count2 = wordCountMap.get(word2);
            if (count1 != count2) return count2 - count1;    //1. 등장 횟수 내림차순
            if (word1.length() != word2.length()) return word2.length() - word1.length();    //2. 단어 길이 내림차순
            return word1.compareTo(word2);    //3. 알파벳 순서 오름차순
        });

        //BufferedWriter로 출력 후 flush 마무리
        for (String word : words) {
            bw.write(word + "\n");
        }
        
        bw.flush();    
        bw.close();
        br.close();
    }
}

