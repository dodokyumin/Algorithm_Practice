package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2750_SellectionSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] arr = new int[N];
	
		//array�뿉 �떞湲�,
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		} 
		
		//�젙�젹 �떆�옉  留덉�留� �슂�냼�뒗 �젙�젹 �븘�슂x -> .length-1
		for(int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {

					minIndex = j;
				}
			}
			swap(arr, minIndex, i);
		}
		
		for(int item : arr) {
			System.out.println(item);
		}

	}
	
	//�옄由� 援먯껜�븯�뒗 硫붿꽌�뱶
	private static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
