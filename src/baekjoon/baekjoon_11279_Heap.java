package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

//���� 11279 �ִ� ��
public class baekjoon_11279_Heap {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ִ� �� ����
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		// N�� ��� �Է�
		int N = Integer.parseInt(br.readLine());

		// N�� ��� �ݺ�
		for (int i = 0; i < N; i++) {
			String order = br.readLine();

			switch (order) {
			
			//0�̸� ���� ���� �� ����ϰ� ����
			case "0":
				if (maxHeap.size() == 0) {
					System.out.println("0");
				} else {
					System.out.println(maxHeap.poll());
				}
				break;
			
			//�� �� �ڿ����� �߰�
			default:
				maxHeap.add(Integer.parseInt(order));
				
			}

		}

	}

}
