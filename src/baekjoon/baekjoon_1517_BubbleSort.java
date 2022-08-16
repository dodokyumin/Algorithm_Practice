package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ð� ������ ����
public class baekjoon_1517_BubbleSort {

	public static int cnt = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N�� ��� �Է�
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		//array�� ���,
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		bubble_sort(arr, arr.length);
		
		System.out.println(cnt);
	}

	private static void bubble_sort(int[] arr, int size) {
		
		//round�� �迭 ũ�� -1 ��ŭ ����
		for(int i = 1; i < size; i++) {
			
			//�� round�� �� Ƚ���� �迭ũ���� ���� ���带 �A ��ŭ
			for(int j = 0; j < size - i; j++) {
				
				//���� ���Ұ� ���� ���Һ��� Ŭ ��� ���� swap
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					cnt++;
				}
			}
		}
		
	}

	private static void swap(int[] arr, int j, int i) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
