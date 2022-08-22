package Programmers.Programmers_Lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sort_string_by_my_will {

	public static void main(String[] args) {

		sort_string_by_my_will ssbmw = new sort_string_by_my_will();

		String[] a = {"abce", "abcd", "cdx"};
		for (String item : ssbmw.solution(a, 2))
			System.out.println(item);

	}

	public String[] solution(String[] strings, int n) {

		List<String> list = new ArrayList<>();

		for (String item : strings) {
			list.add( item.charAt(n) + item);
		}
		
		Collections.sort(list);
		
		for (int i = 0; i < list.size(); i++) {
			strings[i] = list.get(i).substring(1);
		}

		return strings;
	}

}
