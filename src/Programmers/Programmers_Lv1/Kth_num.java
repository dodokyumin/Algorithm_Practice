package Programmers.Programmers_Lv1;

public class Kth_num {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] comm = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
				
		for(int item : solution(arr, comm)) {
			System.out.println(item);
		}

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		// 2차원 배열 모든 요소에 접근
		for (int i = 0; i < commands.length; i++) {

			int start = commands[i][0] -1;
			int end = commands[i][1];
			int num_index = commands[i][2];

			// 새로 자른 것들을 담을 배열 생성
			int[] cut = new int[end - start + 1];

			// 배열 cut에 담을 index 순서 k
			for (int j = start, k = 0; j < end; j++, k++) {
				cut[k] = array[j];
			}

			// 배열 cut 정렬 하기
			int[] sorted = bubble_sort(cut, cut.length);

			// answer 배열에 담기
			answer[i] = sorted[num_index];

		}

		return answer;
	}

	public static int[] bubble_sort(int[] arr, int size) {

		// round는 배열 크기만큼 진행됨
		for (int i = 1; i < size; i++) {

			// 각 라운드 별 진행 횟수는 배열의 현재 라운드 크기 뺀 것.
			for (int j = 0; j < size - i; j++) {
				
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
				}

			}
		}

		return arr;
	}

	private static void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
