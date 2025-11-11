import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		for(int t=0; t<T; t++) {
			int N = scan.nextInt();
			int team[] = new int[N];
			
			int winnerScore = Integer.MAX_VALUE;
			int winnerTeam = 0;
			int f = 0;  //5섯 번째 선수
			
			//팀별 인원 카운트
			Map<Integer, Integer> count = new HashMap<>();
			for(int i=0; i<N; i++) {
				team[i] = scan.nextInt();
				count.put(team[i], count.getOrDefault(team[i], 0)+1); 
				//getOrDefault : team[i]값이 있다면 반화, 없다면 0 반환
			}
			
			//팀 점수 할당
			Map<Integer, ArrayList<Integer>> score = new HashMap<>();
			int nScore = 1;
			for(int j : team) {
				//인원이 6명 이상일 때만
				if (count.get(j) >= 6) {
					score.computeIfAbsent(j, k -> new ArrayList<>()).add(nScore);
					//키가 없으면 함수를 실행하여 새로운 값을 생성하고 맵에 추가한 다음 새로운 값을 반환
					nScore++;
				}
			}
			
			//팀 점수 합산
			
			for(Map.Entry<Integer, ArrayList<Integer>> entry : score.entrySet()) {
				int teamNum = entry.getKey();
				ArrayList<Integer> teamScore = entry.getValue();
				
				//상위 4명 점수 합산
				int totalScore = 0;
				for(int s=0; s<4; s++) {
					totalScore += teamScore.get(s);
				}
				
				if(totalScore < winnerScore) {
					winnerScore = totalScore;
					winnerTeam = teamNum;
					f = teamScore.get(4);
				}
				else if(totalScore == winnerScore) {
					//5번재 주자 비교
					if(teamScore.get(4) < f) {
						winnerTeam = teamNum;
						f = teamScore.get(4);
					}
				}
			}
			
			//우승팀 출력
			System.out.println(winnerTeam);
		}
	}
}