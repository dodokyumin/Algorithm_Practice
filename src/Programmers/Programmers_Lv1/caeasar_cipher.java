package Programmers.Programmers_Lv1;

public class caeasar_cipher {

	public static void main(String[] args) {
		caeasar_cipher cc = new caeasar_cipher();

		String s = "a B z";
		int n = 4;
		System.out.println(cc.solution(s, n));

	}

	public String solution(String s, int n) {

		char[] charArr = s.toCharArray();

		for (int i = 0; i < charArr.length; i++) {

			int item = charArr[i];
			
			// 공백
			if (item == 32)
				continue;
			// 대문자
			else if (item >= 65 && item <= 90) {
				if (item + n > 90) {
					charArr[i] = (char)((item + n) - 90 + 64);
				} else {
					charArr[i] = (char)(item + n);
				}
			} // 소문자
			else if (item >= 97 && item <= 122) {
				if (item + n > 122) {
					charArr[i] = (char)((item + n) - 122 + 96);
				} else {
					charArr[i] = (char)(item + n);
				}
			}
		}
		String answer = "";
		
		for(char item : charArr) {
			answer += item;
		}
		return answer;
	}
}
