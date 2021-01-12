package step1;

import java.util.*;

// 완주하지 못한 선수
public class Ex03 {

	public static void main(String[] args) {
		
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		
		String[] completion = { "stanko", "ana", "mislav" };
		
		System.out.println(solution(participant, completion));

	}
	
	public static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < completion.length; i++) {
				
			if(!(participant[i].equals(completion[i]))) {
				answer = participant[i];
				break;
			}
			
			answer = participant[i + 1]; // # 위의 설명 확인
			
		}
	
		return answer;
		
	}

}
