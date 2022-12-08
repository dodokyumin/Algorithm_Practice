package Programmers.Programmers_Lv1;

public class the_smallest_rectangle {

	public static void main(String[] args) {

		int[][] sizes = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
		System.out.println(solution(sizes));
	}

	public static int solution(int[][] sizes) {
		int wid = 0;
		int len = 0;

		for (int i = 0; i < sizes.length; i++) {
			if (sizes[i][0] < sizes[i][1]) {
				sizes[i] = swap(sizes[i]);
			}

			if (wid < sizes[i][0]) {
				wid = sizes[i][0];
			}
			if (len < sizes[i][1]) {
				len = sizes[i][1];
			}
		}

		return wid * len;
	}

	private static int[] swap(int[] i) {
		int tmp = i[1];
		i[1] = i[0];
		i[0] = tmp;

		return i;
	}
}
