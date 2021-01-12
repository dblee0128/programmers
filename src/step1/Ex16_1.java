package step1;

// 문자열 다루기 기본
public class Ex16_1 {

	public static void main(String[] args) {
		
		System.out.println(solution("a234")); // f
		System.out.println(solution("1234")); // t
		System.out.println(solution("123 ")); // f
		System.out.println(solution("123")); // f
		System.out.println(solution("1qqq")); // f
	}
	
	public static boolean solution(String s) {
		
		boolean answer = false;
		
		if(s.length() == 4 || s.length() == 6) {
			
			for(int i = 0; i < s.length(); i++) {
				
				if('0' > s.charAt(i) || s.charAt(i) > '9') {
					return answer;
				}
				
			}
			return true;
			
		}
		
		return answer; // false // 문자열의 길이가 4,6이 아닌 경우
		
	}
	
}