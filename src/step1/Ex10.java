package step1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 같은 숫자는 싫어
// 배열을 리스트에 넣고 중복되는 수를 제거하는 방식 (제거)
public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[]{ 1,1,3,3,0,1,1 }));
		System.out.println(solution(new int[]{ 4,4,4,3,3 }));
		
	}
	
	public static int[] solution(int[] arr) {
		
		int[] answer = {};
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		for(int i = 0; i < list.size() - 1; i++) {
			
			if(list.get(i) == list.get(i+1)) {
				
				list.remove(i);
				i = -1; // 제거하면 순서가 변경되므로 다시 처음부터 돌기 위해 추가
	
			}
	
		}
		
		answer = list.stream().mapToInt(i->i).toArray();
		
		return answer;
	
	}

}