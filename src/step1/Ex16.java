package step1;

// 문자열 다루기 기본
public class Ex16 {

	public static void main(String[] args) {
		
		System.out.println(solution("a234")); // f
		System.out.println(solution("1234")); // t
		System.out.println(solution("123 ")); // f
		System.out.println(solution("123")); // f
		System.out.println(solution("1qqq")); // f
	}
	
	public static boolean solution(String s) {
		
		boolean answer = false;
		
		char[] arr = s.toCharArray();
		
		if(s.length() == 4 || s.length() == 6) {
			
			for(int i = 0; i < arr.length; i++) {
				
				if(48 > arr[i] || arr[i] > 57) { // 숫자가 아닌게 하나라도 나오면
					return answer; // false
				} 

			}
			
			return true; // 문자열의 길이도 맞고 모두 숫자라면
			
		} 
		
		return answer; // false // 문자열의 길이가 4,6이 아닌 경우
		
	}
	
}