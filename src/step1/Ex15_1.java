package step1;

import java.util.Arrays;
import java.util.Collections;

// 문자열 내림차순으로 배치하기
public class Ex15_1 {

	public static void main(String[] args) {
		
		System.out.println(solution("Zbcdefg"));
		System.out.println(solution("aBcDeFg"));
		
	}
	
	public static String solution(String s) {
		
		String answer = "";
		
		String[] arr = s.split("");
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		answer = String.join("", arr);
		
		return answer;
		
	}
	
}