package Programmers.Programmers_Lv1;

public class the_year_2016 {

	public static void main(String[] args) {
		the_year_2016 ty6 = new the_year_2016();
		System.out.println(ty6.solution(5, 24));
	}

	public String solution(int a, int b) {
		String answer = "";
		String[] day = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		int[] mon = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (a > 1) {
			int totDay = 0;
			for (int i = 0; i < a - 1; i++) {
				totDay += mon[i];
			}
			totDay += b;
			answer = day[totDay % 7];
		} else {
			answer = day[b % 7];
		}
		return answer;
	}
}
