import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();
        int[][] a = new int[N][M];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                a[i][j] = sc.nextInt();

        final int INF = 1_000_000_000;
        int[][][] dp = new int[N][M][3];

        // 첫 행 초기화: 방향 구분 의미 없으니 동일 값
        for (int j = 0; j < M; j++) Arrays.fill(dp[0][j], a[0][j]);

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // d=0 (왼쪽 아래로 도착): 이전 칸은 (i-1, j+1)
                dp[i][j][0] = INF;
                if (j + 1 < M) {
                    dp[i][j][0] = a[i][j] + Math.min(dp[i - 1][j + 1][1], dp[i - 1][j + 1][2]);
                }

                // d=1 (아래로 도착): 이전 칸은 (i-1, j)
                dp[i][j][1] = a[i][j] + Math.min(dp[i - 1][j][0], dp[i - 1][j][2]);

                // d=2 (오른쪽 아래로 도착): 이전 칸은 (i-1, j-1)
                dp[i][j][2] = INF;
                if (j - 1 >= 0) {
                    dp[i][j][2] = a[i][j] + Math.min(dp[i - 1][j - 1][0], dp[i - 1][j - 1][1]);
                }
            }
        }

        int ans = INF;
        for (int j = 0; j < M; j++)
            for (int d = 0; d < 3; d++)
                ans = Math.min(ans, dp[N - 1][j][d]);

        System.out.println(ans);
    }
}
