package step1;

// 두 정수 사이의 합
public class Ex12 {

	public static void main(String[] args) {
		
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
		System.out.println(solution(2, -1));
		
	}
	
	public static long solution(int a, int b) {
		
		long answer = 0;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i = min; i <= max; i++) { // i <= max 이므로 a, b가 같을 경우도 포함
			answer += i;
		}
		
		return answer;
		
	}

}