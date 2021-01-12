package step1;

import java.util.ArrayList;
import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
public class Ex11 {

	public static void main(String[] args) {
		
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		
		System.out.println(solution(arr, divisor));
		
	}
	
	public static int[] solution(int[] arr, int divisor) {
		
		Arrays.sort(arr);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
			
		}

		if(list.size() == 0) {
			list.add(-1);
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	
	}

}