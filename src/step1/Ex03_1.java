package step1;

import java.util.HashMap;
import java.util.Map;

public class Ex03_1 {
	
	public static void main(String[] args) {
	
		String[] participant = {"leo", "kiki", "eden"};
		
		String[] completion = {"eden", "kiki"};
		
		System.out.println(solution(participant, completion));
		
	}
	
	static String solution(String[] participant, String[] completion) {
		
		String answer = "";
		
		Map<String, Integer> map = new HashMap<>(); // key: 선수이름, value: 수(동명이인 체크)
		
		for(String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
			// value값이 없다면 0+1=1로 변경 (즉, 모든 새로운 player는 1 값을 갖는다)
			// value가 중복되는 경우 1+1=2로 변경 (이후에 동명이인이 나올 경우 기존 1 값에 1을 더해준다)
		}
		
		for(String player : completion) {
			map.put(player, map.get(player) - 1);
			// 완주자는 value 감소
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
			} // value값이 1인 경우 -> completion 목록에 없다 -> 완주하지 못했다
		}
		
		return answer;
	}

}
