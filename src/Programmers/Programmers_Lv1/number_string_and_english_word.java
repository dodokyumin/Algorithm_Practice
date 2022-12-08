package Programmers.Programmers_Lv1;

import java.util.HashMap;
import java.util.Iterator;

public class number_string_and_english_word {

	public static void main(String[] args) {

		String s = "one4seveneight";
		System.out.println(solution(s));
	}
	
	public static int solution(String s) {
        
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("0", "zero");
		map.put("1", "one");
		map.put("2", "two");
		map.put("3", "three");
		map.put("4", "four");
		map.put("5", "five");
		map.put("6", "six");
		map.put("7", "seven");
		map.put("8", "eight");
		map.put("9", "nine");

		Iterator<String> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			String key = keys.next();
			s = s.replace(map.get(key), key);
		}
		
        return Integer.parseInt(s);
    }
}
