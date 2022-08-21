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
		// 2 �̸��� N �� �Է¹����� �Ҽ��� �Ǻ��� �ʿ� �����Ƿ� �ٷ� return
		if (n < 2) {
			answer = 0;
		} else {
			boolean[] prime = make_prime(n);
			for (int i = 0; i < prime.length; i++) {
				if (prime[i] == false) { // �Ҽ�(false)�� ��� ���
					answer++;
				}
			}
		}

		return answer;
	}

	public static boolean[] make_prime(int N) {
		boolean[] prime = new boolean[N + 1]; // 0 ~ N // �Ҽ��� üũ�� �迭

		/*
		 * �Ҽ��� �ƴ� index = true �Ҽ��� index = false
		 */

		prime[0] = prime[1] = true;

		// ������ �Լ� : Math.sqrt()
		for (int i = 2; i <= Math.sqrt(N); i++) {

			// �̹� üũ�� �迭�̸� ���� �ݺ������� skip
			if (prime[i] == true) {
				continue;
			}

			// i �� ������� �ɷ��ֱ� ���� �ݺ���
			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
		return prime;

	}
}
