package Programmers.Programmers_Lv1;

import java.util.Scanner;

public class find_prime_number {

	public static void main(String[] args) {
		find_prime_number fpn = new find_prime_number();
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		System.out.println(fpn.solution(N));
		in.close();
	}

	public int solution(int n) {
		int answer = 0;
		// 2 미만의 N 을 입력받으면 소수는 판별할 필요 없으므로 바로 return
		if (n < 2) {
			answer = 0;
		} else {
			boolean[] prime = make_prime(n);
			for (int i = 0; i < prime.length; i++) {
				if (prime[i] == false) { // 소수(false)일 경우 출력
					answer++;
				}
			}
		}

		return answer;
	}

	public static boolean[] make_prime(int N) {
		boolean[] prime = new boolean[N + 1]; // 0 ~ N // 소수를 체크할 배열

		/*
		 * 소수가 아닌 index = true 소수인 index = false
		 */

		prime[0] = prime[1] = true;

		// 제곱근 함수 : Math.sqrt()
		for (int i = 2; i <= Math.sqrt(N); i++) {

			// 이미 체크된 배열이면 다음 반복문으로 skip
			if (prime[i] == true) {
				continue;
			}

			// i 의 배수들을 걸러주기 위한 반복문
			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
		return prime;

	}
}
