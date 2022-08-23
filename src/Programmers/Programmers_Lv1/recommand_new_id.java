package Programmers.Programmers_Lv1;

import java.util.ArrayDeque;
import java.util.Deque;

public class recommand_new_id {

	public static void main(String[] args) {
		recommand_new_id rni = new recommand_new_id();
		System.out.println(rni.solution("---"));// "bat.y.abcdefghi"
	}

	/*
	 * ���̵��� ���̴� 3�� �̻� 15�� ���Ͽ��� �մϴ�. ]
	 * 
	 * ���̵�� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.) ���ڸ� ����� �� �ֽ��ϴ�.
	 * 
	 * ��, ��ħǥ(.)�� ó���� ���� ����� �� ������ ���� �������� ����� �� �����ϴ�.
	 * 
	 */

	/*
	 * ��1 "...!@BaT#*..y.abcdefghijklm" "bat.y.abcdefghi" ��2 "z-+.^." "z--" ��3 "=.="
	 * "aaa" ��4 "123_.def" "123_.def" ��5 "abcdefghijklmn.p" "abcdefghijklmn"
	 */

	public String solution(String new_id) {
		String answer = "";

		// 1. �빮��->�ҹ���, Ư������ ����. []�� �տ� \\�� �־�����Ѵ�.!!
		answer = new_id.toLowerCase().replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");

		// 2. ��ħǥ(.) ����
		answer = period(answer);
		
		// 3. ���� �� ���߱�
		answer = length(answer);

		return answer;
	}

	private String length(String answer) {

		if (answer.length() > 15) {
			answer = answer.substring(0, 15);

		} else if (answer.length() < 3 && answer.length() > 0) {
			// answer�� 0�ʰ�, �ּұ��� 3�� �ȵ� ��� �� ������ ���� ����.
			String last_char = Character.toString(answer.charAt(answer.length() - 1));
			for (int i = 0; i < 3 - (answer.length() - 1); i++) {
				answer += last_char;
			}
			// answer�� null�� ���
		} else if (answer.length() == 0) {
			answer = "aaa";
		}

		// �߰��� �� �� ��ħǥ(.) �ִٸ� �߶��ֱ�
		if (answer.charAt(0) == '.') {
			answer = answer.substring(1);
		}
		if (answer.charAt(answer.length() - 1) == '.') {
			answer = answer.substring(0, answer.length() - 1);
		}
		return answer;

	}

	private String period(String answer) {
		Deque<String> dq = new ArrayDeque<>();
		String return_answer = "";

		dq.add(Character.toString(answer.charAt(0)));

		// ��ħǥ(.)�� �������� ���� ���ϵ���
		for (int i = 1; i < answer.length(); i++) {
			if (!(dq.peekLast().equals(".") && answer.charAt(i) == '.')) {
				dq.addLast(Character.toString(answer.charAt(i)));
			}
		}

		// ��ħǥ(.)�� �� �հ� �� �� ��� ����.
		if (dq.size() > 0) {
			if (dq.peekFirst().equals(".")) {
				dq.removeFirst();
			}
		}

		if (dq.size() > 0) {
			if (dq.peekLast().equals(".")) {
				dq.removeLast();
			}
		}
		// ���� �迭�� ���
		for (String s : dq) {
			return_answer += s;
		}

		return return_answer;
	}

}
