package step1;

// 두 정수 사이의 합
public class Ex12_1 {

	public static void main(String[] args) {
		
		System.out.println(solution(3, 5));
		System.out.println(solution(3, 3));
		System.out.println(solution(5, 3));
		System.out.println(solution(2, -1));
		
	}
	
	public static long solution(int a, int b) {
		
		long answer = 0;
		
		if(a < b) {
			for(int i = a; i <= b; i++) {
				answer = answer + i;
			}
		} else if(a > b) {
			for(int i = a; i >= b; i--) {
				answer = answer + i;
			}
		} else {
			return a;
		}
		
		return answer;
		
	}

}