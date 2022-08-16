package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

//백준 11279 최대 힙
public class baekjoon_11279_Heap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 최대 힙 생성
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		// N번 명령 입력
		int N = Integer.parseInt(br.readLine());

		// N번 명령 반복
		for (int i = 0; i < N; i++) {
			String order = br.readLine();

			switch (order) {
			
			//0이면 제일 높은 값 출력하고 제거
			case "0":
				if (maxHeap.size() == 0) {
					System.out.println("0");
				} else {
					System.out.println(maxHeap.poll());
				}
				break;
			
			//그 외 자연수는 추가
			default:
				maxHeap.add(Integer.parseInt(order));
				
			}

		}

	}

}
