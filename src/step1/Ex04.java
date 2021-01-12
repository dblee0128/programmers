package step1;

import java.util.*;

// 모의고사
public class Ex04 {

	public static void main(String[] args) {
		
		System.out.println(solution(new int[]{ 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 }));
		System.out.println(solution(new int[]{ 1, 3, 2, 4, 2 }));
		System.out.println(solution(new int[]{ 5, 4, 3, 2, 1 }));
		
	}
	
	public static int[] solution(int[] answers) {
		
		int[] answer = {}; // 가장 많이 맞힌 사람이 저장될 배열
		
		int[] cnt = new int[3]; // cnt[0]: a가 맞힌 개수, cnt[1]: b가 맞힌 개수, cnt[2]: c가 맞힌 개수
		
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		
		for(int i = 0; i < answers.length; i++) {
			
			if(a[i%5] == answers[i]) { 
				cnt[0]++;
			}
			
			if(b[i%8] == answers[i]) { 
				cnt[1]++; 
			}
			
			if(c[i%10] == answers[i]) { 
				cnt[2]++; 
			}

		}
		
		// cnt 배열에서 가장 큰 수 가져오기 (동일한 경우가 있을 수 있으니 리스트에 담아서 내보내자)
		List<Integer> list = new ArrayList<Integer>();
		
		int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
		
		if(max == cnt[0]) {
			list.add(1);
		}
		
		if(max == cnt[1]) {
			list.add(2);
		}
		
		if(max == cnt[2]) {
			list.add(3);
		}
		
		answer = list.stream().mapToInt(i->i).toArray();
		
		System.out.println(Arrays.toString(answer));
		
		return answer;
		
	}

}
