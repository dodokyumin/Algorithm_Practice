package Programmers.Programmers_Lv1;

public class collatzs_guess {
	
	public static int cnt;

	public static void main(String[] args) {
		cnt = 0;
		System.out.println(solution(6));
	}

	public static int solution(long num) {
		
		if (num == 1) {
			return cnt;
		} else if (cnt == 500) {
			cnt = -1;
			return cnt;
		} else if (num % 2 == 0) {
			cnt++;
			solution(num / 2);
		} else {
			cnt++;
			solution(num * 3 + 1);
		}

		return cnt;
	}

}
