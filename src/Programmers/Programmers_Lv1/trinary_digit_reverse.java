package Programmers.Programmers_Lv1;

import java.util.ArrayList;
import java.util.List;

public class trinary_digit_reverse {

	public static void main(String[] args) {

		int n = 9;
		System.out.println(solution(n));
	}

	public static int solution(int n) {

		int answer = 0;

		List<Integer> trinary = new ArrayList<Integer>();

		if (n < 3) {
			answer = n;
		} else if (n == 3) {
			answer = 1;
		} else {

			// to 3진법 reverse
			while (n >= 3) {

				trinary.add(n % 3);

				if (n / 3 < 3) {
					trinary.add(n / 3);
					break;
				}

				n = n / 3;
			}

			
			//해당 자릿수의 3의 n제고
			double digit = trinary.size() - 1;

			for (int i : trinary) {
				answer += i * Math.pow(3, digit);
				digit--;
			}

		}
		return answer;
	}

}
