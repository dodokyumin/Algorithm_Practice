package Programmers.Programmers_Lv1;

import java.util.Arrays;
import java.util.Collections;

public class let_string_desc {

	public static void main(String[] args) {

		System.out.println(solution("Zbcdefg"));

	}

	public static String solution(String s) {

		let_string_desc lsd = new let_string_desc();

		char[] arrS = s.toCharArray();

		StringBuilder upper = new StringBuilder();
		StringBuilder lower = new StringBuilder();

		// 대소문자 분류
		for (int i = 0; i < arrS.length; i++) {
			// 대문자인 경우
			if ((Character.valueOf(arrS[i])).hashCode() <= 90) {
				upper.append(arrS[i]);

				// 소문자인 경우
			} else {
				lower.append(arrS[i]);
			}
		}

		String[] upperArr = upper.toString().split("");
		String[] lowerArr = lower.toString().split("");

		Arrays.sort(upperArr, Collections.reverseOrder());
		Arrays.sort(lowerArr, Collections.reverseOrder());

		String answer = lsd.arr_append_str(lowerArr) + lsd.arr_append_str(upperArr);

		return answer;
	}

	public String arr_append_str(String[] arr) {

		StringBuilder sb = new StringBuilder();

		for (String item : arr) {
			sb.append(item);
		}

		String s = sb.toString();

		return s;
	}

}
