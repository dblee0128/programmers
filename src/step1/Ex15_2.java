package step1;

import java.util.Arrays;

// 문자열 내림차순으로 배치하기
public class Ex15_2 {

	public static void main(String[] args) {
		
		System.out.println(solution("Zbcdefg"));
		System.out.println(solution("aBcDeFg"));
		
	}
	
	public static String solution(String s) {
		
		String answer = "";
		
		char[] arr = s.toCharArray();
		
		Arrays.sort(arr); // 오름차순 정렬
		
		// char[] -> String -> StringBuilder
		StringBuilder sb = new StringBuilder(new String(arr));
		
		// StringBuilder의 reverse()로 정렬 뒤집기 = 내림차순
		// toString()으로 다시 String형으로 변환
		answer = sb.reverse().toString();
		
		return answer;
		
	}
	
}