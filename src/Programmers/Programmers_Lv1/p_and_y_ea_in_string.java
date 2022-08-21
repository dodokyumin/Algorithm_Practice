package Programmers.Programmers_Lv1;

public class p_and_y_ea_in_string {

	public static void main(String[] args) {
		p_and_y_ea_in_string pys = new p_and_y_ea_in_string();
		System.out.println(pys.solution("pPoooyY"));
	}

	boolean solution(String s) {

		boolean answer = false;
		int cnt_P = 0;
		int cnt_Y = 0;

		char[] charArr = s.toUpperCase().toCharArray();

		for (char c : charArr) {
			switch (c) {
				case 'P' :
					cnt_P++;
					break;
				case 'Y' :
					cnt_Y++;
					break;
			}
		}
		
		if(cnt_P == cnt_Y || cnt_P + cnt_Y == 0) {
			answer = true;
		}
		return answer;
	}
}
