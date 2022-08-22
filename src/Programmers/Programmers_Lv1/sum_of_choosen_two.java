package Programmers.Programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class sum_of_choosen_two {

	public static void main(String[] args) {
		sum_of_choosen_two soct = new sum_of_choosen_two();
		int[] a = { 5,0,7,2 };
		for (int e : soct.solution(a)) {
			System.out.println(e);
		}

	}

	public int[] solution(int[] numbers) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (!list.contains(numbers[i] + numbers[j]) && i != j) {
					list.add(numbers[i] + numbers[j]);
				}
			}
		}
		
		//int[] answer = list.toArray(new int[list.size()]); //new int 말고 Integer(원시형)가 와야하지만 배열 타입이 Integer가 올 수 없으므로,
		//이러한 방법은 String 타입 리스트에서만.
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		Arrays.sort(answer);
		
		return answer;
	}

}
