package step1;

import java.util.Arrays;
import java.util.Comparator;

// 문자열 내 마음대로 정렬하기
public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println(solution(new String[]{"sun", "bed", "car"} , 1));
		System.out.println(solution(new String[]{"abce", "abcd", "cdx"} , 2));
		
	}
	
	public static String[] solution(String[] strings, int n) {
		
		String[] answer = new String[strings.length];
	
		// 조건 중 같은 문자열이 여럿 일 경우 사전순으로 나열하기 위해
		// 미리 strings 배열을 사전순으로 정렬한 상태에서 비교를 시작
		Arrays.sort(strings);
		
		System.out.println(Arrays.toString(strings)); // [bed, car, sun]
		
		
		// 입력받은 n번 인덱스의 문자들 비교
		// Comparator를 익명 클래스로 구현
		Arrays.sort(strings, new Comparator<String>() { // strings[]를 돌면서 

			@Override
			public int compare(String o1, String o2) { // 문자들을 서로 비교하자
				
				String s1 = o1.substring(n, n + 1); // n번째 문자를 저장
				String s2 = o2.substring(n, n + 1);
				
				// 비교 결과에 따라 int 반환
				// s1 == s2: 0, s1 > s2: 1, s1 < s2: -1
				
				return s1.compareTo(s2); // s1,s2만 비교해서 다시 기본 정렬 = 오름차순 정렬
				
			}
			
		});
		
		System.out.println(Arrays.toString(strings)); // [car, bed, sun]
		
		for(int i = 0; i < strings.length; i++) {
			answer[i] = strings[i];
		}
		
		System.out.println(Arrays.toString(answer)); // [car, bed, sun]
		
		return answer;
		
	}

}