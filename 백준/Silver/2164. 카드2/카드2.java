import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while (q.size() > 1) {
            q.poll();               // 제일 위 카드 버리기
            q.add(q.poll());        // 그다음 카드 맨 뒤로 보내기
        }

        System.out.println(q.peek());
    }
}
