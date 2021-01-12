package step1;

import java.util.Arrays;

// 문자열 내 마음대로 정렬하기 (실패)
public class Ex13_1 {

	public static void main(String[] args) {
		
		System.out.println(solution(new String[]{"sun", "bed", "car"} , 1));
		System.out.println(solution(new String[]{"abce", "abcd", "cdx"} , 2));
		
		
	}
	
	public static String[] solution(String[] strings, int n) {
		
		Arrays.sort(strings);
		
		String[] answer = new String[strings.length]; // 정답이 담길 배열
		
		char[] temp = new char[strings.length]; // 잘린 글자가 담길 배열
		
		// strings[] 각 문자열의 n번째 글자 가져오기
		for(int i = 0; i < strings.length; i++) {
			
			temp[i] = strings[i].charAt(n);
			
		}
		
		Arrays.sort(temp);
		
		System.out.println(Arrays.toString(temp));
		

		for(int i = 0; i < temp.length; i++) {
			
			for(int j = 0; j < temp.length; j++) {
				
				if(temp[i] == strings[j].charAt(n)) {

					answer[i] = strings[j];
					break;
					
				}
				
			
			}
			
			
		}

		for(int i = 0; i < answer.length - 1; i++) {
			
			if(answer[i].charAt(n) == answer[i+1].charAt(n)) {
				
				int result = answer[i].compareTo(answer[i+1]);
				
				String tmp = "";
				
				if(result == 1) {
					tmp = answer[i];
					answer[i] = answer[i+1];
					answer[i+1] = tmp;
				} 
				
				
			}
	
		}

		System.out.println(Arrays.toString(answer));
		
		return answer;
		
	}

}