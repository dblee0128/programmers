package step1;

import java.util.ArrayList;
import java.util.List;

// 같은 숫자는 싫어
// 배열에서 해당하는 값만 리스트에 추가하는 방식 (추가)
public class Ex10_2 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[]{ 1,1,3,3,0,1,1 }));
		System.out.println(solution(new int[]{ 4,4,4,3,3 }));
		System.out.println(solution(new int[]{ 8,4,3,3,8,8,8 }));
		
	}
	
	public static int[] solution(int[] arr) {
		
		List<Integer> list = new ArrayList<>(); // 숫자를 추가할 리스트
		
		list.add(arr[0]); // 리스트의 첫 번째에는 비교를 위해 값을 먼저 넣어줌

		for(int i = 0; i < arr.length - 1; i++) {
			
			if(arr[i] != arr[i+1]) {
				list.add(arr[i+1]); // 기준 값과 다음 값이 다를 경우 그냥 추가해줘
			}
			
		}
		
		// list -> Array 변환
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
	
	}

}