package step1;

import java.util.Stack;

// 크레인 인형뽑기 - 스택
public class Ex01_1 {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, 
						  { 0, 0, 1, 0, 3 }, 
						  { 0, 2, 5, 0, 1 }, 
						  { 4, 2, 4, 4, 2 },
						  { 3, 5, 1, 3, 1 } };

		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));

	}

	public static int solution(int[][] board, int[] moves) {

		int answer = 0;
		
		Stack<Integer> stack = new Stack<>(); // 인형을 담을 스택

		for(int i = 0; i < moves.length; i++) {
			
			for(int j = 0; j < board.length; j++) {
				
				int n = board[j][moves[i] - 1]; // 뽑은 인형
				
				if(n != 0) { // 인형이 뽑히면
					
					// 스택이 비어 있다면 여기로 (첫 번째 경우는 무조건 인형을 넣는다)
					if(stack.isEmpty()) {
						stack.push(n);
						board[j][moves[i] - 1] = 0;
						break;
					}
					
					// 스택이 비어있지 않다면 여기로
					if(stack.peek() == n) { // 스택 맨 위의 숫자가 방금 뽑은 것과 같은지 확인만!
						stack.pop(); // 같으면 제거 (새로운건 아직 추가도 안했으니 하나만 제거해도 OK)
						answer = answer + 2;
					} else { // 같지 않으면
						stack.push(n); // 추가
					}
					
					// if, else 로직 모두 해당되어야 하므로 괄호 밖으로 빼기
					board[j][moves[i] - 1] = 0;
					break;
					
				}
			}
		}
		
		return answer;

	}

}
