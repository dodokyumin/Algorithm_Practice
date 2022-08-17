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

		// 2���� �迭 ��� ��ҿ� ����
		for (int i = 0; i < commands.length; i++) {

			int start = commands[i][0] -1;
			int end = commands[i][1];
			int num_index = commands[i][2];

			// ���� �ڸ� �͵��� ���� �迭 ����
			int[] cut = new int[end - start + 1];

			// �迭 cut�� ���� index ���� k
			for (int j = start, k = 0; j < end; j++, k++) {
				cut[k] = array[j];
			}

			// �迭 cut ���� �ϱ�
			int[] sorted = bubble_sort(cut, cut.length);

			// answer �迭�� ���
			answer[i] = sorted[num_index];

		}

		return answer;
	}

	public static int[] bubble_sort(int[] arr, int size) {

		// round�� �迭 ũ�⸸ŭ �����
		for (int i = 1; i < size; i++) {

			// �� ���� �� ���� Ƚ���� �迭�� ���� ���� ũ�� �� ��.
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
