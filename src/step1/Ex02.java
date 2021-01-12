package step1;

import java.util.*;

// 두 개 뽑아서 더하기
public class Ex02 {

	public static void main(String[] args) {
		
		int[] numbers = { 5, 0, 2, 7 };
		
		System.out.println(solution(numbers));

	}
	
	public static int[] solution(int[] numbers) {
		
		int[] answer = {};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < numbers.length; i++) { // 기준이 되는 수
			
			for(int j = i+1; j < numbers.length; j++) { // # int j = i + 1
				
				set.add(numbers[i] + numbers[j]);
				
			}
			
		}
		
		List<Integer> list = new LinkedList<>(set); // set -> list로 변환
		Collections.sort(list); // list 정렬
		
		answer = list.stream().mapToInt(i->i).toArray(); // list -> int[]로 변환
	
		return answer;
		
	}

}
