package Programmers.Programmers_Lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//lv.1 나누어 떨어지는 숫자 배열
public class divide_cleanly_num_array {

	public static void main(String[] args) {

		int[] arr = { 3, 2, 6 };

		for (int item : solution(arr, 10)) {
			System.out.println(item);
		}
	}

	public static int[] solution(int[] arr, int divisor) {

		List<Integer> arrList = new ArrayList<>();

		for (int item : arr) {
			if (item % divisor == 0) {
				arrList.add(item);
			}
		}

		if (arrList.size() > 0) {
			int[] answer = new int[arrList.size()];

			for (int i = 0; i < arrList.size(); i++) {
				answer[i] = arrList.get(i);
			}

			Arrays.sort(answer);
			return answer;
			
		} else {
			
			int[] answer = {-1};
			return answer;
		}
		
	}

}
