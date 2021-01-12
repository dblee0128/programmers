package step1;

// 3진법 뒤집기
public class Ex08 {

	public static void main(String[] args) {
		
		System.out.println(solution(45));

	}
	
	public static int solution(int n) {
		
		int answer = 0;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(Integer.toString(n, 3)); // 45를 3진법으로 변환 -> 1200
		
		sb.reverse(); // 값 반전 -> 0021
		
		int a = sb.length() - 1;
		
		for(int i = 0; i < sb.length(); i++) {
			
			int before = Integer.parseInt(sb.substring(i, i + 1));
			answer = (int) (answer + before * Math.pow(3, a));
			a--;
			
		}
		

		return answer;
		
	}

}