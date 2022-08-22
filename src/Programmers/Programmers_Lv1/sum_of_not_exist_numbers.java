package Programmers.Programmers_Lv1;

public class sum_of_not_exist_numbers {

	public static void main(String[] args) {
		sum_of_not_exist_numbers sonen = new sum_of_not_exist_numbers();
		int[] a = {1,2,3,4,6,7,8,0};
		System.out.println(sonen.solution(a));
	}

	public int solution(int[] numbers) {
		int sum = 45;
		for(int i : numbers) {
			sum -= i;
		}
		return sum;
	}
}
