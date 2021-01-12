package step1;

// 문자열 내 p와 y의 개수
public class Ex14 {

	public static void main(String[] args) {
		
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
		System.out.println(solution("pppyy"));
		
	}
	
	public static boolean solution(String s) {
		
		boolean answer = true;
		
		s = s.toLowerCase();
	
		int pCnt = 0;
		int yCnt = 0;
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == 'p') {
				pCnt++;
			} else if(s.charAt(i) == 'y') {
				yCnt++;
			}
			
		}
		
		if(pCnt != yCnt) {
			return false;
		} 
		
		return answer;
		
	}

}