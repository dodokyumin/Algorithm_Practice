package Programmers.Programmers_Lv1;

public class calculate_insufficient_money {

	public static void main(String[] args) {
		calculate_insufficient_money cim = new calculate_insufficient_money();
		System.out.println(cim.solution(3, 20, 4));
	}

	public long solution(int price, int money, int count) {
		long answer = -1;

		long total_price = 0;
		for (int i = 1; i <= count; i++) {
			total_price += price * i;
		}
		
		answer = money - total_price;
		if (answer > 0) {
			answer = 0;
		} else {
			answer = Math.abs(answer);
		}
		return answer;
	}
}
