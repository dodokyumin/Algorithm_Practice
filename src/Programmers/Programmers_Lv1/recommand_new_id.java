package Programmers.Programmers_Lv1;

import java.util.ArrayDeque;
import java.util.Deque;

public class recommand_new_id {

	public static void main(String[] args) {
		recommand_new_id rni = new recommand_new_id();
		System.out.println(rni.solution("---"));// "bat.y.abcdefghi"
	}

	/*
	 * 아이디의 길이는 3자 이상 15자 이하여야 합니다. ]
	 * 
	 * 아이디는 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.) 문자만 사용할 수 있습니다.
	 * 
	 * 단, 마침표(.)는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없습니다.
	 * 
	 */

	/*
	 * 예1 "...!@BaT#*..y.abcdefghijklm" "bat.y.abcdefghi" 예2 "z-+.^." "z--" 예3 "=.="
	 * "aaa" 예4 "123_.def" "123_.def" 예5 "abcdefghijklmn.p" "abcdefghijklmn"
	 */

	public String solution(String new_id) {
		String answer = "";

		// 1. 대문자->소문자, 특수문자 제거. []는 앞에 \\로 넣어줘야한다.!!
		answer = new_id.toLowerCase().replaceAll("[~!@#$%^&*()=+\\[{\\]}:?,<>/]", "");

		// 2. 마침표(.) 정제
		answer = period(answer);
		
		// 3. 글자 수 맞추기
		answer = length(answer);

		return answer;
	}

	private String length(String answer) {

		if (answer.length() > 15) {
			answer = answer.substring(0, 15);

		} else if (answer.length() < 3 && answer.length() > 0) {
			// answer가 0초과, 최소길이 3이 안될 경우 맨 마지막 글자 복사.
			String last_char = Character.toString(answer.charAt(answer.length() - 1));
			for (int i = 0; i < 3 - (answer.length() - 1); i++) {
				answer += last_char;
			}
			// answer가 null일 경우
		} else if (answer.length() == 0) {
			answer = "aaa";
		}

		// 추가로 앞 뒤 마침표(.) 있다면 잘라주기
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

		// 마침표(.)가 연속으로 들어가지 못하도록
		for (int i = 1; i < answer.length(); i++) {
			if (!(dq.peekLast().equals(".") && answer.charAt(i) == '.')) {
				dq.addLast(Character.toString(answer.charAt(i)));
			}
		}

		// 마침표(.)가 맨 앞과 뒤 일 경우 제거.
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
		// 리턴 배열에 담기
		for (String s : dq) {
			return_answer += s;
		}

		return return_answer;
	}

}
