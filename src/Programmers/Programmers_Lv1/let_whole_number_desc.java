package Programmers.Programmers_Lv1;

import java.util.Arrays;
import java.util.Collections;

public class let_whole_number_desc {

	public static void main(String[] args) {

		System.out.println(solution(118372));

	}

	public static long solution(long n) {

		String strN = String.valueOf(n);

		String[] arrN = strN.split("");

		Arrays.sort(arrN, Collections.reverseOrder());

		strN = Arrays.toString(arrN).replace("[", "").replace(" ", "").replace(",", "").replace("]", "");
		
		long answer = Long.parseLong(strN);
		
		return answer;
	}
	
	//StringBuilder È°¿ë
//	public long solution(long n) {
//        String[] list = String.valueOf(n).split("");
//        Arrays.sort(list);
//
//        StringBuilder sb = new StringBuilder();
//        for (String aList : list) sb.append(aList);
//
//        return Long.parseLong(sb.reverse().toString());
//  }
}
