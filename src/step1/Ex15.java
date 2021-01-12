package step1;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내림차순으로 배치하기
public class Ex15 {

	public static void main(String[] args) {
		
		System.out.println(solution("Zbcdefg"));
		System.out.println(solution("aBcDeFg"));
		
	}
	
	public static String solution(String s) {
		
		String answer = "";
	
		// 1. String -> String[] 변환
		String[] arr = s.split("");
		
		// 2. String[] 내림차순 정렬 정의
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}

		});
		
		// 3. String[] -> String 변환
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
		}
		
		answer = sb.toString();
		
		return answer;
	}
	
}