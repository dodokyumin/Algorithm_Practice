package Programmers.Programmers_Lv1;

public class number_of_divisor_and_addition {

	public static void main(String[] args) {
		number_of_divisor_and_addition nodaa = new number_of_divisor_and_addition();
		int a = 13;
		int b = 17;
		System.out.println(nodaa.solution(a, b));
	}

	public int solution(int left, int right) {
		int answer = 0;
		
		for(int i = left; i <= right; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt++;
				}
			}
			if(cnt % 2 == 0) {
				answer += i;
			} else {
				answer -= i;
			}
		}
		
		return answer;
	}
}
