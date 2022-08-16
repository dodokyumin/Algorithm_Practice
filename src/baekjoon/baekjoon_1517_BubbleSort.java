package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//시간 제한을 넘음
public class baekjoon_1517_BubbleSort {

	public static int cnt = 0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// N번 명령 입력
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
		
		//array에 담기,
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		bubble_sort(arr, arr.length);
		
		System.out.println(cnt);
	}

	private static void bubble_sort(int[] arr, int size) {
		
		//round는 배열 크기 -1 만큼 수행
		for(int i = 1; i < size; i++) {
			
			//각 round별 비교 횟수는 배열크기의 현재 라운드를 뺸 만큼
			for(int j = 0; j < size - i; j++) {
				
				//현재 원소가 다음 원소보다 클 경우 서로 swap
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
