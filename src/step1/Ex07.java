package step1;

// 2016년
public class Ex07 {

	public static void main(String[] args) {
		
		System.out.println(solution(5, 23));

	}
	
	public static String solution(int a, int b) {
		
		String answer = "";
		
		int[] month = { 31, 29, 31, 30, 31, 30, 
						31, 31, 30, 31, 30, 31 }; // 1~12월 날짜 수 (윤년)
		
		String[] week = { "FRI", "SAT", "SUN", "MON", 
						  "TUE", "WED", "THU" }; // 1월 1일이 금요일이므로 금요일부터
		
		int sum = 0; // 날짜 합계가 담길 변수
		
		// 입력으로 들어온 달의 전까지 모든 달의 수를 더함
		for(int i = 0; i < a - 1; i++) {
			sum += month[i];
		}
		
		/*
		 	+b : 입력받은 날짜 더해주기
		 	-1 : 1월 1일 빼주기
		 	%7 : week.length만큼 나눠주기
		*/
		
		sum = (sum + b - 1);
		
		answer = week[sum % 7];
		
		return answer;
		
	}

}
