package step1;

import java.util.ArrayList;

// 크레인 인형뽑기 - 리스트
public class Ex01 {

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
		
		ArrayList<Integer> list = new ArrayList<>(); // 인형을 담을 리스트

		for (int i = 0; i < moves.length; i++) { // 움직임 배열을 돌자 1, 5, 3, 5, ...

			for (int j = 0; j < board.length; j++) { // 보드판을 돌자

				if (!(board[j][moves[i] - 1] == 0)) { // 돌다가 0이 아닌 수를 만나면
					list.add(board[j][moves[i] - 1]); // 그 수를 리스트에 저장하자
					board[j][moves[i] - 1] = 0; // 그리고 뽑은 인형은 0으로 만들자
					break; // 문제 발생 1. 이제 멈추고 다음 moves로 이동하자
				}

			}
		}

		for (int i = 0; i < list.size() - 1; i++) {

			if (list.get(i) == list.get(i + 1)) { // i번째 수와 그 다음 수가 같으면
	
				list.remove(i); // i번째 수 제거
				list.remove(i); // 이미 i번째 수를 제거했기 때문에 i+1이 아닌 i를 또 제거
				answer = answer + 2; // 두 개의 수를 제거하므로 +2
				
				i = -1; // 문제 발생 2. for문을 다시 돌아라

			}

		}

		return answer;

	}

}
