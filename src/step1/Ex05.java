package step1;

// 체육복
public class Ex05 {

	public static void main(String[] args) {
		
//		int n = 5;
//		int[] lost = { 2, 4 };
//		int[] reserve = { 1, 3, 5 };
		
//		int n = 5;
//		int[] lost = { 2, 4 };
//		int[] reserve = { 3 };
		
		int n = 3;
		int[] lost = { 3 };
		int[] reserve = { 1 };
		
		System.out.println(solution(n, lost, reserve));
		
	}
	
	public static int solution(int n, int[] lost, int[] reserve) {
		
		int answer = n - lost.length; // 무조건 수업을 들을 수 있는 학생 수
		
		// 여벌이 있는데 도난 당한 학생 구하기
		for(int i = 0; i < reserve.length; i++) {
			
			for(int j = 0; j < lost.length; j++) {
				
				if(reserve[i] == lost[j]) { // 여벌이 있는 학생이 도난을 당했다면
					lost[j] = -1; // 도난 목록에서 제외
					reserve[i] = -1; // # 빌려주는 학생에서도 제외
					answer++; // n - lost.length로 도난 당한 학생도 빠져있기 때문에 나중에 다시 더해줘야함
					break;
				}
				
			}
		}
		
		// 체육복 빌려주기
		for(int i = 0; i < reserve.length; i++) {
			
			for(int j = 0; j < lost.length; j++) {
				
				if(lost[j] == reserve[i] + 1 || lost[j] == reserve[i] - 1) {
					lost[j] = -1;
					answer++;
					break;
				}
				
			}
			
		}
		
		return answer;
		
	}

}
