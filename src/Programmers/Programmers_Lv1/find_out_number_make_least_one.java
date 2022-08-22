package Programmers.Programmers_Lv1;

public class find_out_number_make_least_one {

	public static void main(String[] args) {
		find_out_number_make_least_one fonmlo = new find_out_number_make_least_one();
		System.out.println(fonmlo.solution(10));

	}

	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 1) {
				answer = i;
				break;
			}
		}

		return answer;
	}
}
