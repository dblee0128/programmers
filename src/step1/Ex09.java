package step1;

// 가운데 글자 가져오기
public class Ex09 {

	public static void main(String[] args) {
		
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));

	}
	
	public static String solution(String s) {
		
		String answer = "";
		
		int num = s.length();
		
		if(num % 2 == 0) { // 짝수라면
			
			answer = s.substring(num / 2 - 1, num / 2 + 1);
			
		} else { // 홀수라면
			
			answer = s.substring(num / 2, num / 2 + 1);
			
		}
		
		return answer;
		
	}

}