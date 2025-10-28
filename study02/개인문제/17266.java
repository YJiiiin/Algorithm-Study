import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); // 굴다리 길이
        int M = scan.nextInt(); // 가로등 개수
        int[] arr = new int[M]; // 가로등 위치 배열

        // 가로등 위치 입력
        for (int i = 0; i < M; i++) {
            arr[i] = scan.nextInt();
        }
        
        int maxGap = arr[0]; // 0부터 첫 번째 가로등까지의 거리

        // 인접한 가로등 사이의 거리 계산
        for (int i = 1; i < M; i++) {
            int diff = arr[i] - arr[i - 1]; // 두 가로등 사이 거리
            int gap = diff / 2; // 둘이 커버할 때 필요한 최소 높이
            if (diff % 2 != 0) gap++; // 거리가 홀수면 올림 처리
            maxGap = Math.max(maxGap, gap); // 최대값 갱신
        }

        // 마지막 가로등 이후 구간 확인
        maxGap = Math.max(maxGap, N - arr[M - 1]);

        // 결과 출력
        System.out.println(maxGap);
    }
}
